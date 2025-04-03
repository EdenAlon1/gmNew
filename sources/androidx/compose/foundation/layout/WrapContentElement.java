package androidx.compose.foundation.layout;

import defpackage.edb;
import defpackage.ffjm;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WrapContentElement extends ivp<edb> {
    private final ffjm a;
    private final Object b;
    private final int c;

    public WrapContentElement(int i, ffjm ffjmVar, Object obj) {
        this.c = i;
        this.a = ffjmVar;
        this.b = obj;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new edb(this.c, this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        edb edbVar = (edb) hvhVar;
        edbVar.b = this.c;
        edbVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.c == wrapContentElement.c && ffkj.e(this.b, wrapContentElement.b);
    }

    public final int hashCode() {
        return (((this.c * 31) + 1237) * 31) + this.b.hashCode();
    }
}
