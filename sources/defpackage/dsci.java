package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsci implements dren {
    public final String a;
    public final drek b;
    private final String c;
    private final String d;
    private final Iterable e;
    private final dscf f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dsci(defpackage.ewnk r14) {
        /*
            r13 = this;
            r14.getClass()
            java.lang.String r1 = r14.c
            r1.getClass()
            java.lang.String r2 = r14.h
            r2.getClass()
            drem r0 = defpackage.dsce.b(r14)
            r0.getClass()
            java.lang.String r3 = r0.b
            r0 = 2
            drem[] r0 = new defpackage.drem[r0]
            r4 = 0
            drem r5 = defpackage.dsce.b(r14)
            r0[r4] = r5
            ewmw r14 = r14.f
            if (r14 != 0) goto L26
            ewmw r14 = defpackage.ewmw.a
        L26:
            if (r14 == 0) goto L4d
            drem r4 = new drem
            drme r5 = defpackage.drme.b
            drld r6 = defpackage.dsce.a(r14)
            java.lang.String r7 = r14.c
            r7.getClass()
            ewmt r8 = r14.f
            if (r8 != 0) goto L3b
            ewmt r8 = defpackage.ewmt.a
        L3b:
            int r8 = r8.b
            ewmt r14 = r14.f
            if (r14 != 0) goto L43
            ewmt r14 = defpackage.ewmt.a
        L43:
            int r9 = r14.c
            r10 = 100
            dsch r12 = defpackage.dsch.a
            r4.<init>(r5, r6, r7, r8, r9, r10, r12)
            goto L4e
        L4d:
            r4 = 0
        L4e:
            r14 = 1
            r0[r14] = r4
            java.util.List r4 = defpackage.ffdo.J(r0)
            dsch r5 = defpackage.dsch.a
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsci.<init>(ewnk):void");
    }

    @Override // defpackage.dren
    public final drek a() {
        return this.b;
    }

    @Override // defpackage.dren
    public final /* synthetic */ drlu b() {
        return drld.d;
    }

    @Override // defpackage.drli
    public final Iterable c() {
        return this.e;
    }

    @Override // defpackage.dren
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dren
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsci)) {
            return false;
        }
        dsci dsciVar = (dsci) obj;
        return ffkj.e(this.a, dsciVar.a) && ffkj.e(this.c, dsciVar.c) && ffkj.e(this.d, dsciVar.d) && ffkj.e(this.e, dsciVar.e) && ffkj.e(this.b, dsciVar.b);
    }

    @Override // defpackage.dren
    public final String f() {
        return this.d;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ doxr fm() {
        return this.b;
    }

    @Override // defpackage.doxx
    public final /* synthetic */ Object fn() {
        return this.f;
    }

    @Override // defpackage.doxs
    public final String fo() {
        String str = this.d;
        String str2 = this.c;
        String b = dqlb.b(this.a);
        String b2 = dqlb.b(str2);
        Uri parse = Uri.parse(str);
        parse.getClass();
        String a = dqlb.a(parse);
        Iterable iterable = this.e;
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((drem) it.next()).fo());
        }
        return "StickerMedia(id='" + b + "', description='" + b2 + "', webUrl='" + a + "', variations=" + arrayList + ", source=" + this.b + ")";
    }

    @Override // defpackage.dren
    public final /* synthetic */ int h() {
        return dreg.b(this);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    @Override // defpackage.drlj
    public final /* bridge */ /* synthetic */ drlw m() {
        drlw b;
        b = b();
        return b;
    }

    public final String toString() {
        return "StickerMedia(id=" + this.a + ", description=" + this.c + ", webUrl=" + this.d + ", variations=" + this.e + ", source=" + this.b + ")";
    }

    public dsci(String str, String str2, String str3, Iterable iterable, drek drekVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = iterable;
        this.b = drekVar;
        this.f = new dscf(new dreh(this));
    }
}
