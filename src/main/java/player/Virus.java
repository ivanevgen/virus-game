package player;


/**
 * Это будет главной абстракцией вируса, за него мы будем играть.
 *
 */
public interface Virus {
    /**
     *
     * @param carrier самый первый источник, может быть любым устройством
     * @return
     */
    Virus genesis(Сarrier carrier);
}