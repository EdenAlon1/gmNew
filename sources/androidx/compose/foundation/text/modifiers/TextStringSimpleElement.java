package androidx.compose.foundation.text.modifiers;

import defpackage.fbw;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ibz;
import defpackage.ith;
import defpackage.itz;
import defpackage.ivp;
import defpackage.ixo;
import defpackage.jpo;
import defpackage.jse;
import defpackage.jyw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ivp<fbw> {
    private final String a;
    private final jpo b;
    private final jse c;
    private final int d;
    private final boolean f;
    private final int g;
    private final int h;
    private final ibz i;

    public TextStringSimpleElement(String str, jpo jpoVar, jse jseVar, int i, boolean z, int i2, int i3, ibz ibzVar) {
        this.a = str;
        this.b = jpoVar;
        this.c = jseVar;
        this.d = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = ibzVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new fbw(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        fbw fbwVar = (fbw) hvhVar;
        ibz ibzVar = fbwVar.h;
        ibz ibzVar2 = this.i;
        boolean e = ffkj.e(ibzVar2, ibzVar);
        fbwVar.h = ibzVar2;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (e && this.b.w(fbwVar.b)) ? false : true;
        String str = this.a;
        if (!ffkj.e(fbwVar.a, str)) {
            fbwVar.a = str;
            fbwVar.i();
            z = true;
        }
        jpo jpoVar = this.b;
        int i = this.h;
        int i2 = this.g;
        boolean z4 = this.f;
        jse jseVar = this.c;
        int i3 = this.d;
        boolean z5 = !fbwVar.b.x(jpoVar);
        fbwVar.b = jpoVar;
        if (fbwVar.g != i) {
            fbwVar.g = i;
            z5 = true;
        }
        if (fbwVar.f != i2) {
            fbwVar.f = i2;
            z5 = true;
        }
        if (fbwVar.e != z4) {
            fbwVar.e = z4;
            z5 = true;
        }
        if (!ffkj.e(fbwVar.c, jseVar)) {
            fbwVar.c = jseVar;
            z5 = true;
        }
        if (jyw.a(fbwVar.d, i3)) {
            z2 = z5;
        } else {
            fbwVar.d = i3;
        }
        if (z || z2) {
            fbwVar.a().e(fbwVar.a, fbwVar.b, fbwVar.c, fbwVar.d, fbwVar.e, fbwVar.f);
        }
        if (fbwVar.z) {
            if (z || (z3 && fbwVar.i != null)) {
                ixo.a(fbwVar);
            }
            if (z || z2) {
                itz.b(fbwVar);
                ith.a(fbwVar);
            }
            if (z3) {
                ith.a(fbwVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return ffkj.e(this.i, textStringSimpleElement.i) && ffkj.e(this.a, textStringSimpleElement.a) && ffkj.e(this.b, textStringSimpleElement.b) && ffkj.e(this.c, textStringSimpleElement.c) && jyw.a(this.d, textStringSimpleElement.d) && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ibz ibzVar = this.i;
        return (((((((((hashCode * 31) + this.d) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g) * 31) + this.h) * 31) + (ibzVar != null ? ibzVar.hashCode() : 0);
    }
}
