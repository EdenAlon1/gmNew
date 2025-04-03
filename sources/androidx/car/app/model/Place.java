package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cim;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    public CarLocation getLocation() {
        CarLocation carLocation = this.mLocation;
        carLocation.getClass();
        return carLocation;
    }

    public PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation, this.mMarker);
    }

    public String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + "]";
    }

    Place(cim cimVar) {
        CarLocation carLocation = cimVar.a;
        this.mLocation = null;
        PlaceMarker placeMarker = cimVar.b;
        this.mMarker = null;
    }
}
