package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ambg implements amaw {
    public static final /* synthetic */ int g = 0;
    private static final entd h = entd.c("BugleContacts");
    public final errl a;
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final Resources i;
    private final ffbr j;
    private final ffbr k;

    public ambg(Context context, errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.i = context.getResources();
        this.a = errlVar;
        this.b = errlVar2;
        this.c = errlVar3;
        this.j = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.k = ffbrVar4;
        this.f = ffbrVar5;
    }

    @Override // defpackage.amaw
    public final elfl a(final String str) {
        if (((Boolean) csrd.a.e()).booleanValue()) {
            final ecri d = ((ecrj) this.f.b()).d();
            return elfo.h(new erog() { // from class: amba
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    Uri uri;
                    engw<csqy> engwVar;
                    int i = engw.d;
                    engr engrVar = new engr();
                    final ambg ambgVar = ambg.this;
                    axvl axvlVar = (axvl) ambgVar.d.b();
                    emxf.l(!efbd.g());
                    if (((ctud) axvlVar.b.b()).i()) {
                        Context context = axvlVar.a;
                        uri = ContactsContract.Directory.ENTERPRISE_CONTENT_URI;
                        Cursor a = new bcqd(context, uri, csqy.b, null, null, null).a();
                        if (a != null) {
                            try {
                                ArrayList arrayList = new ArrayList(a.getCount());
                                if (a.moveToFirst()) {
                                    do {
                                        arrayList.add(csqy.c(a));
                                    } while (a.moveToNext());
                                }
                                engw n = engw.n(arrayList);
                                a.close();
                                engwVar = n;
                            } finally {
                            }
                        } else {
                            engwVar = enou.a;
                        }
                    } else {
                        engwVar = enou.a;
                    }
                    for (csqy csqyVar : engwVar) {
                        if (!csqy.e().contains(Long.valueOf(csqyVar.a()))) {
                            engrVar.h(csqyVar);
                        }
                    }
                    engr engrVar2 = new engr();
                    engw g2 = engrVar.g();
                    int i2 = ((enou) g2).c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        final String str2 = str;
                        final csqy csqyVar2 = (csqy) g2.get(i3);
                        engrVar2.h(elfj.d(new erov() { // from class: amax
                            @Override // defpackage.erov
                            public final Object a(erpc erpcVar) {
                                ambg ambgVar2 = ambg.this;
                                csqz b = ((axvm) ambgVar2.e.b()).b(str2, csqyVar2);
                                erpcVar.a(b, ambgVar2.a);
                                return b;
                            }
                        }, ambgVar.c).f(new erow() { // from class: amay
                            @Override // defpackage.erow
                            public final Object a(erpc erpcVar, Object obj) {
                                return ambg.this.d(((csqz) obj).a());
                            }
                        }, ambgVar.b).h());
                    }
                    final engw g3 = engrVar2.g();
                    return elfo.j(engrVar2.g()).a(new Callable() { // from class: amaz
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i4;
                            int i5 = ambg.g;
                            int i6 = engw.d;
                            engr engrVar3 = new engr();
                            HashSet hashSet = new HashSet();
                            int i7 = 0;
                            while (true) {
                                engw engwVar2 = engw.this;
                                if (i7 >= ((enou) engwVar2).c) {
                                    return engrVar3.g();
                                }
                                engw engwVar3 = (engw) erqt.q((elfl) engwVar2.get(i7));
                                int size = engwVar3.size();
                                int i8 = 0;
                                while (true) {
                                    i4 = i7 + 1;
                                    if (i8 < size) {
                                        ambn ambnVar = (ambn) engwVar3.get(i8);
                                        if (hashSet.add(ambnVar.f())) {
                                            engrVar3.h(ambnVar);
                                        }
                                        i8++;
                                    }
                                }
                                i7 = i4;
                            }
                        }
                    }, ambgVar.a);
                }
            }, this.b).h(new emwl() { // from class: ambb
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    engw engwVar = (engw) obj;
                    ((ecrj) ambg.this.f.b()).f(d, csra.c, null, ecrh.SUCCESS);
                    return engwVar;
                }
            }, this.a);
        }
        int i = engw.d;
        return elfo.e(enou.a);
    }

    @Override // defpackage.amaw
    public final elfl b(final String str) {
        elfl c;
        if (!((Boolean) cvqt.g.e()).booleanValue()) {
            final ecri d = ((ecrj) this.f.b()).d();
            return elfj.d(new erov() { // from class: ambc
                @Override // defpackage.erov
                public final Object a(erpc erpcVar) {
                    ambg ambgVar = ambg.this;
                    axvm axvmVar = (axvm) ambgVar.e.b();
                    String str2 = str;
                    csqz c2 = axvm.e(str2) ? axvmVar.c(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, str2, csqy.a) : axvmVar.d(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, str2, csqy.a);
                    erpcVar.a(c2, ambgVar.a);
                    return c2;
                }
            }, this.c).f(new erow() { // from class: ambd
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    ambg ambgVar = ambg.this;
                    ecrj ecrjVar = (ecrj) ambgVar.f.b();
                    ecri ecriVar = d;
                    ecrjVar.f(ecriVar, csra.a, null, ecrh.SUCCESS);
                    engw d2 = ambgVar.d(((csqz) obj).a());
                    ((ecrj) ambgVar.f.b()).f(ecriVar, csra.f, null, ecrh.SUCCESS);
                    return d2;
                }
            }, this.c).h();
        }
        ambp ambpVar = (ambp) this.k.b();
        str.getClass();
        if (str.length() == 0) {
            int i = engw.d;
            elfl e = elfo.e(enou.a);
            e.getClass();
            return e;
        }
        ecri d2 = ((ecrj) ambpVar.d.b()).d();
        c = axol.c(ambpVar.c, ffhe.a, ffsm.a, new ambo(ambpVar.f.a(str, "com.google.android.gms", new String[]{"internal.3p:Person"}, 0, 20, ambp.b), ambpVar, d2, null));
        return c;
    }

    @Override // defpackage.amaw
    public final elfl c(final String str) {
        final ecri d = ((ecrj) this.f.b()).d();
        return elfj.d(new erov() { // from class: ambe
            @Override // defpackage.erov
            public final Object a(erpc erpcVar) {
                ambg ambgVar = ambg.this;
                csqz b = ((axvm) ambgVar.e.b()).b(str, csqy.d());
                erpcVar.a(b, ambgVar.a);
                return b;
            }
        }, this.c).f(new erow() { // from class: ambf
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                ambg ambgVar = ambg.this;
                ((ecrj) ambgVar.f.b()).f(d, csra.b, null, ecrh.SUCCESS);
                return ambgVar.d(((csqz) obj).a());
            }
        }, this.a).h();
    }

    public final engw d(Cursor cursor) {
        HashSet hashSet;
        aoku aokuVar;
        if (cursor == null) {
            int i = engw.d;
            return enou.a;
        }
        ecri d = ((ecrj) this.f.b()).d();
        int i2 = engw.d;
        engr engrVar = new engr();
        HashSet hashSet2 = new HashSet();
        int intValue = ((Integer) cvqt.h.e()).intValue();
        boolean booleanValue = ((Boolean) cvqt.i.e()).booleanValue();
        while (cursor.moveToNext() && (!booleanValue || cursor.getPosition() < intValue)) {
            String b = emxe.b(cursor.getString(1));
            String string = cursor.getString(2);
            String string2 = cursor.getString(6);
            if (string2 == null) {
                ((ensz) ((ensz) h.j()).h("com/google/android/apps/messaging/shared/api/messaging/contact/ContactSearchApiImpl", "cursorToSearchContactEntry", 190, "ContactSearchApiImpl.java")).q("Cp2 returns empty lookup key");
            } else {
                long j = cursor.getLong(7);
                if (hashSet2.add(Long.valueOf(j))) {
                    String string3 = cursor.getString(3);
                    if (string3 == null || bdrw.c(string3)) {
                        hashSet = hashSet2;
                        aokuVar = null;
                    } else {
                        hashSet = hashSet2;
                        aokuVar = ((aolr) this.j.b()).n(string3);
                    }
                    if (aokuVar == null) {
                        ((ensz) ((ensz) h.j()).h("com/google/android/apps/messaging/shared/api/messaging/contact/ContactSearchApiImpl", "cursorToSearchContactEntry", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "ContactSearchApiImpl.java")).q("Cp2 returns empty destination");
                    } else {
                        String l = Long.toString(j);
                        String string4 = cursor.getString(5);
                        if (string4 == null) {
                            string4 = this.i.getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(cursor.getInt(4)));
                        }
                        engrVar.h(new ambk(l, string2, b, aokuVar, string4, string == null ? null : Uri.parse(string)));
                    }
                    hashSet2 = hashSet;
                } else {
                    ((ensz) ((ensz) h.j()).h("com/google/android/apps/messaging/shared/api/messaging/contact/ContactSearchApiImpl", "cursorToSearchContactEntry", 198, "ContactSearchApiImpl.java")).q("Cp2 returns contact with duplicated id");
                }
            }
        }
        if (d != null) {
            ((ecrj) this.f.b()).f(d, csra.e, null, ecrh.SUCCESS);
        }
        return engrVar.g();
    }
}
