package com.extantape.waycave;

import java.util.Optional;
import org.bukkit.Location;

/** Test stand-in with the same shape as Waycave 0.8.0's service. */
public interface LandingService {
    Optional<Location> landing(String world);
}
