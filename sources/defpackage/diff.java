package defpackage;

import com.google.android.gms.wearable.internal.AbstractWearableCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
class diff extends AbstractWearableCallbacks {
    private dfse a;

    public diff(dfse dfseVar) {
        this.a = dfseVar;
    }

    public final void a(Object obj) {
        dfse dfseVar = this.a;
        if (dfseVar != null) {
            dfseVar.c(obj);
            this.a = null;
        }
    }
}
