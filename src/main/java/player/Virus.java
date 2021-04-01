package player;


/**
 * Это будет главной абстракцией вируса, за него мы будем играть.
 *
 */
public interface Virus {

    /**
     *
     * @param carrier самый первый источник, может быть любым устройством
     * @return какой то вирус. Это в todo
     */
    Virus genesis(Сarrier carrier);
}