package androidx.car.app.navigation.model;

import androidx.car.app.model.CarText;
import defpackage.cfs;
import defpackage.ckm;
import defpackage.clb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class Trip {
    private final CarText mCurrentRoad;
    private final List<TravelEstimate> mDestinationTravelEstimates;
    private final List<Destination> mDestinations;
    private final boolean mIsLoading;
    private final List<TravelEstimate> mStepTravelEstimates;
    private final List<Step> mSteps;

    private Trip() {
        this.mDestinations = Collections.EMPTY_LIST;
        this.mSteps = Collections.EMPTY_LIST;
        this.mDestinationTravelEstimates = Collections.EMPTY_LIST;
        this.mStepTravelEstimates = Collections.EMPTY_LIST;
        this.mCurrentRoad = null;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return Objects.equals(this.mDestinations, trip.mDestinations) && Objects.equals(this.mSteps, trip.mSteps) && Objects.equals(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && Objects.equals(this.mStepTravelEstimates, trip.mStepTravelEstimates) && Objects.equals(this.mCurrentRoad, trip.mCurrentRoad) && Objects.equals(Boolean.valueOf(this.mIsLoading), Boolean.valueOf(trip.mIsLoading));
    }

    public CarText getCurrentRoad() {
        return this.mCurrentRoad;
    }

    public List<TravelEstimate> getDestinationTravelEstimates() {
        return clb.a(this.mDestinationTravelEstimates);
    }

    public List<Destination> getDestinations() {
        return clb.a(this.mDestinations);
    }

    public List<TravelEstimate> getStepTravelEstimates() {
        return clb.a(this.mStepTravelEstimates);
    }

    public List<Step> getSteps() {
        return clb.a(this.mSteps);
    }

    public int hashCode() {
        return Objects.hash(this.mDestinations, this.mSteps, this.mDestinationTravelEstimates, this.mStepTravelEstimates, this.mCurrentRoad);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[ destinations : " + this.mDestinations.toString() + ", steps: " + this.mSteps.toString() + ", dest estimates: " + this.mDestinationTravelEstimates.toString() + ", step estimates: " + this.mStepTravelEstimates.toString() + ", road: " + CarText.toShortString(this.mCurrentRoad) + ", isLoading: " + this.mIsLoading + "]";
    }

    Trip(ckm ckmVar) {
        List list = ckmVar.a;
        this.mDestinations = clb.b(null);
        List list2 = ckmVar.b;
        this.mSteps = clb.b(null);
        List list3 = ckmVar.c;
        this.mDestinationTravelEstimates = clb.b(null);
        List list4 = ckmVar.d;
        this.mStepTravelEstimates = clb.b(null);
        CarText carText = ckmVar.e;
        this.mCurrentRoad = null;
        boolean z = ckmVar.f;
        this.mIsLoading = false;
    }
}
