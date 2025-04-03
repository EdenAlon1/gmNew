package androidx.compose.foundation;

import defpackage.dfe;
import defpackage.dhf;
import defpackage.dwn;
import defpackage.ffix;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jjj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClickableElement extends ivp<dfe> {
    private final dhf a;
    private final boolean b;
    private final String c;
    private final jjj d;
    private final ffix f;
    private final dwn g;

    public ClickableElement(dwn dwnVar, dhf dhfVar, boolean z, String str, jjj jjjVar, ffix ffixVar) {
        this.g = dwnVar;
        this.a = dhfVar;
        this.b = z;
        this.c = str;
        this.d = jjjVar;
        this.f = ffixVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dfe(this.g, this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((dfe) hvhVar).x(this.g, this.a, this.b, this.c, this.d, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return ffkj.e(this.g, clickableElement.g) && ffkj.e(this.a, clickableElement.a) && this.b == clickableElement.b && ffkj.e(this.c, clickableElement.c) && ffkj.e(this.d, clickableElement.d) && this.f == clickableElement.f;
    }

    public final int hashCode() {
        dwn dwnVar = this.g;
        int hashCode = dwnVar != null ? dwnVar.hashCode() : 0;
        dhf dhfVar = this.a;
        int hashCode2 = ((((hashCode * 31) + (dhfVar != null ? dhfVar.hashCode() : 0)) * 31) + (true != this.b ? 1237 : 1231)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        jjj jjjVar = this.d;
        return ((hashCode3 + (jjjVar != null ? jjjVar.a : 0)) * 31) + this.f.hashCode();
    }
}
