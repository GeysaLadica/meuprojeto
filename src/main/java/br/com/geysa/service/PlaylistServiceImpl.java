package br.com.geysa.service;

import br.com.geysa.dao.PlaylistDao;
import br.com.geysa.domain.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService{

    @Autowired
    private PlaylistDao playlistDao;

    @Override
    public void salvar(Playlist playlist) {
        playlistDao.salvar(playlist);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Playlist> recuperar() {
        return playlistDao.recuperar();
    }

    @Override
    public Playlist recuperarPorId(long id) {
        return playlistDao.recuperarPorId(id);
    }

    @Override
    public void atualizar(Playlist playlist) {
        playlistDao.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistDao.excluir(id);
    }
}
