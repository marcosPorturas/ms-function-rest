package com.pe.web.function.app.proxy;

import com.pe.web.function.app.dto.response.movie.MovieResponse;

import io.reactivex.Single;

public interface MovieProxy {

	Single<MovieResponse> getMovieResponse(Integer codMovie);
}
