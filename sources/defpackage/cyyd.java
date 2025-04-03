package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyyd extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cyyg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyyd(cyyg cyygVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = cyygVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Throwable th;
        boolean z;
        boolean z2;
        String c;
        ?? r18;
        cjwi cjwiVar;
        cjwi cjwiVar2;
        dnym dnynVar;
        Uri a;
        Uri n;
        ffci.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r4 = this.d;
        if (obj2 == czaj.a) {
            return null;
        }
        if (r1.b() == alxi.GROUP && obj3 == null) {
            final cyyg cyygVar = this.e;
            if (!cyygVar.m.a() || (a = r1.a()) == null || (n = crjm.n(a)) == null || !csuu.C(n)) {
                List v = crjm.v(((azze) cyygVar.i.b()).c(crjg.b, (engw) r4));
                v.getClass();
                ArrayList arrayList = new ArrayList(ffdx.n(v, 10));
                Iterator it = v.iterator();
                while (it.hasNext()) {
                    arrayList.add(Uri.parse((String) it.next()));
                }
                List<Uri> aa = ffdx.aa(arrayList);
                ArrayList arrayList2 = new ArrayList(ffdx.n(aa, 10));
                for (Uri uri : aa) {
                    Uri n2 = crjm.n(uri);
                    if (n2 == null) {
                        n2 = cyyg.b(uri);
                    }
                    Uri uri2 = n2;
                    Uri m = crjm.m(uri);
                    Uri b = m != null ? cyyg.b(m) : null;
                    uri2.getClass();
                    arrayList2.add(new dnwn(uri2, false, null, null, b, 12));
                }
                dnynVar = new dnyn(arrayList2, dnyl.c, 0.1f, null, 35);
            } else {
                dnynVar = new dnyo(new dnwn(n, false, null, null, crjm.m(a), 12), null, 0, null, 0.0f, null, 62);
            }
            Context context = cyygVar.a;
            cjwi cjwiVar3 = cjwi.PROFILE_UNSPECIFIED_SOURCE;
            String string = context.getString(R.string.contact_picture_title);
            string.getClass();
            czai czaiVar = new czai(dnynVar, cjwiVar3, string, true, null, null);
            String i = r1.i();
            List b2 = ffdx.b(czaiVar);
            String string2 = cyygVar.a.getString(R.string.set_as_chat_picture_button_title);
            string2.getClass();
            String string3 = cyygVar.a.getString(R.string.set_as_chat_picture_button_title);
            string3.getClass();
            cyxt cyxtVar = new cyxt(string2, string3, new ffji() { // from class: cyxx
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    ((cjwi) obj4).getClass();
                    return ffcu.a;
                }
            });
            return new cyyj(i, b2, cyxtVar, new ffix() { // from class: cyxy
                @Override // defpackage.ffix
                public final Object invoke() {
                    cyyg.this.o.a();
                    return ffcu.a;
                }
            }, (czaj) obj2, new cyyi(false, cyygVar.l.a(), cyygVar.j.a()));
        }
        final cyyg cyygVar2 = this.e;
        final ?? r42 = obj3 == null ? (ResolvedRecipient) ffdx.K(r4) : obj3;
        cyyc cyycVar = cyygVar2.n;
        cjwi p = r42.p();
        engw u = r42.u();
        obj2.getClass();
        if (cyycVar.a || obj2 == czaj.a) {
            th = null;
            z = false;
        } else if (obj2 == czaj.d) {
            z = false;
            th = null;
        } else {
            czaj czajVar = czaj.c;
            cyycVar.d = (obj2 == czajVar && obj3 == null) ? 2 : obj2 == czajVar ? 3 : 5;
            akzt akztVar = (akzt) cyycVar.c.h.b();
            int i2 = cyycVar.d;
            th = null;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            akztVar.e("Bugle.PhotoSelector.Open.Count", i3);
            z = true;
        }
        if (cyycVar.b || obj2 != czaj.d) {
            z2 = false;
        } else {
            akzt akztVar2 = (akzt) cyycVar.c.h.b();
            int i4 = cyycVar.d;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw th;
            }
            akztVar2.e("Bugle.PhotoSelector.Back.Count", i5);
            z2 = true;
        }
        if (z) {
            cyycVar.a = true;
            cyycVar.b = false;
            if (u.size() == 2 && (cjwiVar2 = ((aqmn) ffdx.K(u)).c) != cjwi.PROFILE_UNSPECIFIED_SOURCE && cjwiVar2 != cjwi.UNRECOGNIZED) {
                ((akzt) cyycVar.c.h.b()).e("Bugle.PhotoSelector.Open.PhotoType.Count", cjwiVar2 == cjwi.PROFILE_PEOPLE_SHARING_SOURCE ? 2 : 1);
            }
            if (u.size() == 1 && (cjwiVar = ((aqmn) ffdx.K(u)).c) != cjwi.PROFILE_UNSPECIFIED_SOURCE && cjwiVar != cjwi.UNRECOGNIZED) {
                ((akzt) cyycVar.c.h.b()).e("Bugle.PhotoViewer.Open.PhotoType.Count", cjwiVar != cjwi.PROFILE_PEOPLE_SHARING_SOURCE ? 1 : 2);
            }
        }
        if (z2) {
            cyycVar.a = false;
            cyycVar.b = true;
        }
        engw u2 = r42.u();
        ArrayList<aqmn> arrayList3 = new ArrayList();
        for (Object obj4 : u2) {
            aqmn aqmnVar = (aqmn) obj4;
            if (aqmnVar.a != null || aqmnVar.b != null) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(ffdx.n(arrayList3, 10));
        for (final aqmn aqmnVar2 : arrayList3) {
            aqmnVar2.getClass();
            Uri uri3 = aqmnVar2.a;
            if (uri3 == null) {
                uri3 = Uri.EMPTY;
            }
            Uri n3 = crjm.n(uri3);
            if (n3 == null) {
                n3 = aqmnVar2.b;
                n3.getClass();
            }
            Uri uri4 = n3;
            Uri uri5 = aqmnVar2.b;
            uri5.getClass();
            dnyo dnyoVar = new dnyo(new dnwn(uri4, true, null, null, uri5, 12), null, 0, dnyl.a, 0.0f, null, 54);
            cjwi cjwiVar4 = aqmnVar2.c;
            String string4 = cjwiVar4 == cjwi.PROFILE_PEOPLE_SHARING_SOURCE ? cyygVar2.a.getString(R.string.google_profile_picture_title) : cyygVar2.a.getString(R.string.contact_picture_title);
            string4.getClass();
            arrayList4.add(new czai(dnyoVar, cjwiVar4, string4, p == aqmnVar2.c, aqmnVar2.c == cjwi.PROFILE_CONTACT_SOURCE ? cyygVar2.a.getString(R.string.contact_picture_subtitle) : th, new ffix() { // from class: cyxz
                @Override // defpackage.ffix
                public final Object invoke() {
                    ResolvedRecipient resolvedRecipient = r42;
                    resolvedRecipient.getClass();
                    if (aqmnVar2.c == cjwi.PROFILE_CONTACT_SOURCE) {
                        cyyg cyygVar3 = cyyg.this;
                        cyygVar3.c.h(new aino(resolvedRecipient));
                        ((akzt) cyygVar3.n.c.h.b()).c("Bugle.PhotoSelector.Contacts.Open.Count");
                        cyygVar3.o.a();
                    }
                    return ffcu.a;
                }
            }));
        }
        List ah = ffdx.ah(arrayList4, new cyye(p));
        r42.getClass();
        if (r42.A() || !r42.k().c()) {
            c = cyygVar2.e.c(r42.x(true));
        } else {
            String y = r42.y();
            if (y == null) {
                r18 = th;
                String string5 = cyygVar2.a.getString(R.string.set_as_chat_picture_button_title);
                string5.getClass();
                String string6 = cyygVar2.a.getString(R.string.set_as_chat_picture_button_title);
                string6.getClass();
                cyxt cyxtVar2 = new cyxt(string5, string6, new ffji() { // from class: cyya
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj5) {
                        cjwi cjwiVar5 = (cjwi) obj5;
                        cjwiVar5.getClass();
                        cyyg cyygVar3 = cyyg.this;
                        axol.k(cyygVar3.b, null, new cyyf(cyygVar3, r42, cjwiVar5, null), 3);
                        return ffcu.a;
                    }
                });
                return new cyyj(r18, ah, cyxtVar2, new ffix() { // from class: cyyb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        cyyg.this.o.a();
                        return ffcu.a;
                    }
                }, (czaj) obj2, new cyyi(false, cyygVar2.l.a(), cyygVar2.j.a()));
            }
            String a2 = cuxh.a(y);
            a2.getClass();
            c = cjze.a(a2);
        }
        r18 = c;
        String string52 = cyygVar2.a.getString(R.string.set_as_chat_picture_button_title);
        string52.getClass();
        String string62 = cyygVar2.a.getString(R.string.set_as_chat_picture_button_title);
        string62.getClass();
        cyxt cyxtVar22 = new cyxt(string52, string62, new ffji() { // from class: cyya
            @Override // defpackage.ffji
            public final Object invoke(Object obj5) {
                cjwi cjwiVar5 = (cjwi) obj5;
                cjwiVar5.getClass();
                cyyg cyygVar3 = cyyg.this;
                axol.k(cyygVar3.b, null, new cyyf(cyygVar3, r42, cjwiVar5, null), 3);
                return ffcu.a;
            }
        });
        return new cyyj(r18, ah, cyxtVar22, new ffix() { // from class: cyyb
            @Override // defpackage.ffix
            public final Object invoke() {
                cyyg.this.o.a();
                return ffcu.a;
            }
        }, (czaj) obj2, new cyyi(false, cyygVar2.l.a(), cyygVar2.j.a()));
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cyyd cyydVar = new cyyd(this.e, (ffgu) obj5);
        cyydVar.a = (alxj) obj;
        cyydVar.b = (czaj) obj2;
        cyydVar.c = (ResolvedRecipient) obj3;
        cyydVar.d = (engw) obj4;
        return cyydVar.b(ffcu.a);
    }
}
