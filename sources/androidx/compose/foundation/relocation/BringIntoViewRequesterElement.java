package androidx.compose.foundation.relocation;

import defpackage.epe;
import defpackage.epf;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BringIntoViewRequesterElement extends ivp<epf> {
    private final epe a;

    public BringIntoViewRequesterElement(epe epeVar) {
        this.a = epeVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new epf(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((epf) hvhVar).a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewRequesterElement) && ffkj.e(this.a, ((BringIntoViewRequesterElement) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
