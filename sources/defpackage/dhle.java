package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.internal.IPhenotypeCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhle extends IPhenotypeCallbacks.Stub {
    private final dhri a;

    public dhle(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onCommitToConfiguration(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onDogfoodsTokenRetrieved(Status status, DogfoodsToken dogfoodsToken) {
        dfup.b(status, dogfoodsToken, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onDogfoodsTokenSet(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onExperimentTokensRetrieved(Status status, ExperimentTokens experimentTokens) {
        dfup.b(status, experimentTokens, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetCommittedConfiguration(Status status, Configurations configurations) {
        dfup.b(status, configurations, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetConfigurationSnapshot(Status status, Configurations configurations) {
        dfup.b(status, configurations, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetFlag(Status status, Flag flag) {
        dfup.b(status, flag, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetServingVersion(Status status, long j) {
        dfup.b(status, Long.valueOf(j), this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onListOrDeleteFlagOverrides(Status status, FlagOverrides flagOverrides) {
        dfup.b(status, flagOverrides, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onRegistered(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetAppSpecificProperties(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetDimensions(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetFlagOverride(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSyncAfter(Status status, long j) {
        dfup.b(status, null, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onUnregistered(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onWeakRegistered(Status status) {
        dfup.a(status, this.a);
    }
}
