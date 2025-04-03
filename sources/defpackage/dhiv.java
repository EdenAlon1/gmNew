package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.AbstractPeopleCallbacks;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhiv extends AbstractPeopleCallbacks {
    private final dfse a;

    public dhiv(dfse dfseVar) {
        this.a = dfseVar;
    }

    @Override // com.google.android.gms.people.internal.AbstractPeopleCallbacks, com.google.android.gms.people.internal.IPeopleCallbacks
    public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.c(new dhix(PeopleClientImpl.O(i, bundle), dataHolder == null ? null : new dhjh(dataHolder)));
    }
}
