package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyy implements axwk {
    public final Executor d;
    public final ejtr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final Context n;
    private final ffhd o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    public static final String[] a = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "display_name", "name_raw_contact_id", "data1", "data4", "data2", "data3", "photo_uri", "photo_thumb_uri", "photo_file_id", "contact_last_updated_timestamp"};
    private static final String[] i = {"data_id", "contact_id", "lookup", "sort_key", "display_name", "number", "normalized_number", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "photo_uri", "photo_thumb_uri", "photo_file_id"};
    public static final String[] b = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "display_name", "name_raw_contact_id", "data1", "data4", "data2", "data3", "photo_uri", "photo_thumb_uri", "contact_last_updated_timestamp"};
    public static final String[] c = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "data4", "name_raw_contact_id", "data1", "data2", "data3", "photo_uri", "photo_thumb_uri", "photo_file_id", "contact_last_updated_timestamp"};
    private static final String[] j = {"contact_id", "data1", "data2", "data3"};
    private static final String[] k = {"contact_id", "data2", "data1"};
    private static final String[] l = {"_id", "contact_id", "mimetype"};
    private static final List m = ffdx.b(axzc.a.b);

    public axyy(Context context, ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, Executor executor, ejtr ejtrVar, ffbr ffbrVar3, @asjz ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        context.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        executor.getClass();
        ejtrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.n = context;
        this.o = ffhdVar;
        this.p = ffbrVar;
        this.q = ffbrVar2;
        this.d = executor;
        this.e = ejtrVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.r = ffbrVar6;
        this.s = ffbrVar7;
    }

    public static final axwi F(axxd axxdVar, axxf axxfVar, axxe axxeVar, engi engiVar) {
        String str = axxfVar != null ? axxfVar.b : axxdVar.g;
        String str2 = axxdVar.d;
        String str3 = axxdVar.e;
        long j2 = axxdVar.f;
        String str4 = axxfVar != null ? axxfVar.c : null;
        String str5 = axxfVar != null ? axxfVar.d : null;
        String str6 = axxdVar.i;
        String str7 = axxdVar.j;
        String str8 = axxdVar.k;
        int i2 = axxdVar.l;
        String str9 = axxdVar.m;
        String str10 = axxdVar.n;
        Uri parse = str10 != null ? Uri.parse(str10) : null;
        String str11 = axxdVar.o;
        Uri parse2 = str11 != null ? Uri.parse(str11) : null;
        Integer num = axxdVar.p;
        String str12 = axxeVar != null ? axxeVar.a : null;
        String str13 = axxeVar != null ? axxeVar.b : null;
        String str14 = axxdVar.c;
        long j3 = axxdVar.b;
        long j4 = axxdVar.a;
        Instant ofEpochMilli = Instant.ofEpochMilli(axxdVar.q);
        ofEpochMilli.getClass();
        return new axwi(j4, j3, str14, str, str2, str3, j2, str4, str5, str6, str7, str8, i2, str9, parse, parse2, num, str12, str13, ofEpochMilli, engiVar);
    }

    public static final List G(List list, Map map, Map map2, enhz enhzVar) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axxd axxdVar = (axxd) it.next();
            axxf axxfVar = (axxf) map.get(Long.valueOf(axxdVar.b));
            axxe axxeVar = (axxe) map2.get(Long.valueOf(axxdVar.b));
            engi c2 = enhzVar.c(Long.valueOf(axxdVar.b));
            c2.getClass();
            arrayList.add(F(axxdVar, axxfVar, axxeVar, c2));
        }
        return arrayList;
    }

    private final ekrc H() {
        ekrc ekrcVar = new ekrc();
        if (((atfd) this.r.b()).a()) {
            ekrcVar.b("(account_type NOT IN ('com.whatsapp', 'com.google.android.apps.tachyon', 'org.thoughtcrime.securesms') OR ");
        } else {
            ekrcVar.b("(account_type NOT IN (\"com.whatsapp\", \"com.google.android.apps.tachyon\", \"org.thoughtcrime.securesms\") OR ");
        }
        ekrcVar.b("account_type IS NULL) AND ");
        return ekrcVar;
    }

    private static final void I(ekrc ekrcVar, String str, List list) {
        int i2 = 0;
        if (list.size() == 1) {
            ekrcVar.b(str);
            ekrcVar.b(" = ?");
            ekrcVar.c(list.get(0).toString());
            return;
        }
        ekrcVar.b(str);
        ekrcVar.b(" IN (");
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ffdx.l();
            }
            ekrcVar.b("?");
            if (i2 < list.size() - 1) {
                ekrcVar.b(",");
            }
            ekrcVar.c(obj.toString());
            i2 = i3;
        }
        ekrcVar.b(")");
    }

    private static final void J(ekrc ekrcVar, axwz axwzVar) {
        int ordinal = axwzVar.ordinal();
        if (ordinal == 0) {
            ekrcVar.b("data1 IS NOT NULL");
        } else {
            if (ordinal != 1) {
                throw new ffcd();
            }
            ekrcVar.b("data1 IS NOT NULL");
        }
    }

    public final Object A(ekrb ekrbVar, axwz axwzVar, ffgu ffguVar) {
        return ffsl.a(new axyb(this, ekrbVar, axwzVar, null), ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.util.List r10, android.net.Uri r11, boolean r12, defpackage.ffgu r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.axyg
            if (r0 == 0) goto L13
            r0 = r13
            axyg r0 = (defpackage.axyg) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            axyg r0 = new axyg
            r0.<init>(r9, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.c
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            boolean r12 = r6.b
            java.lang.Object r10 = r6.a
            defpackage.ffci.b(r13)
            goto L92
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.ffci.b(r13)
            if (r12 == 0) goto L6b
            java.util.ArrayList r13 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ffdx.n(r10, r1)
            r13.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
        L48:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            boolean r5 = android.provider.ContactsContract.Contacts.isEnterpriseContactId(r3)
            if (r5 == 0) goto L62
            r7 = -1000000000(0xffffffffc4653600, double:NaN)
            long r3 = r3 + r7
        L62:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            r13.add(r5)
            goto L48
        L6b:
            r13 = r10
        L6c:
            ekrc r1 = new ekrc
            r1.<init>()
            java.lang.String r3 = "_id"
            I(r1, r3, r13)
            ekrb r4 = r1.a()
            java.lang.String[] r3 = new java.lang.String[]{r3}
            axwo r5 = new axwo
            r5.<init>()
            r6.a = r10
            r6.b = r12
            r6.e = r2
            r1 = r9
            r2 = r11
            java.lang.Object r13 = r1.C(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L92
            return r0
        L92:
            java.util.List r13 = (java.util.List) r13
            if (r12 == 0) goto Lc0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L9f:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lbf
            java.lang.Object r12 = r10.next()
            r0 = r12
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            boolean r0 = r13.contains(r2)
            if (r0 == 0) goto L9f
            r11.add(r12)
            goto L9f
        Lbf:
            return r11
        Lc0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.B(java.util.List, android.net.Uri, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(android.net.Uri r5, java.lang.String[] r6, defpackage.ekrb r7, final defpackage.ffji r8, defpackage.ffgu r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.axyl
            if (r0 == 0) goto L13
            r0 = r9
            axyl r0 = (defpackage.axyl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axyl r0 = new axyl
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r9)
            goto L59
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r9)
            ejtr r9 = r4.e
            r2 = 0
            erph r5 = r9.a(r5, r6, r7, r2)
            axww r6 = new axww
            r6.<init>()
            axwx r7 = new axwx
            r7.<init>()
            java.util.concurrent.Executor r6 = r4.d
            erph r5 = r5.e(r7, r6)
            erqc r5 = r5.g()
            r5.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r5, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.C(android.net.Uri, java.lang.String[], ekrb, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(defpackage.ekrb r9, final defpackage.axwz r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.axyw
            if (r0 == 0) goto L13
            r0 = r11
            axyw r0 = (defpackage.axyw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axyw r0 = new axyw
            r0.<init>(r8, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            ekzz r9 = r6.d
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L6a
        L2a:
            r0 = move-exception
            r10 = r0
            goto L74
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.ffci.b(r11)
            java.lang.String r11 = "Cp2DataService#queryRawContacts"
            ekzz r11 = defpackage.eleg.f(r11)
            r1 = r2
            android.net.Uri r2 = r10.a()     // Catch: java.lang.Throwable -> L70
            ffbr r3 = r8.h     // Catch: java.lang.Throwable -> L70
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L70
            r3.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L70
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L70
            java.lang.String[] r3 = r10.c(r3)     // Catch: java.lang.Throwable -> L70
            axwr r5 = new axwr     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
            r6.d = r11     // Catch: java.lang.Throwable -> L70
            r6.c = r1     // Catch: java.lang.Throwable -> L70
            r1 = r8
            r4 = r9
            java.lang.Object r9 = r1.C(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L70
            if (r9 == r0) goto L6f
            r7 = r11
            r11 = r9
            r9 = r7
        L6a:
            r10 = 0
            defpackage.ffig.a(r9, r10)
            return r11
        L6f:
            return r0
        L70:
            r0 = move-exception
            r9 = r0
            r10 = r9
            r9 = r11
        L74:
            throw r10     // Catch: java.lang.Throwable -> L75
        L75:
            r0 = move-exception
            r11 = r0
            defpackage.ffig.a(r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.D(ekrb, axwz, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(java.util.List r9, final defpackage.axwz r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.axyv
            if (r0 == 0) goto L13
            r0 = r11
            axyv r0 = (defpackage.axyv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axyv r0 = new axyv
            r0.<init>(r8, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            ekzz r9 = r6.d
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r0 = move-exception
            r10 = r0
            goto L80
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.ffci.b(r11)
            java.lang.String r11 = "Cp2DataService#queryRawContacts"
            ekzz r11 = defpackage.eleg.f(r11)
            r1 = r2
            android.net.Uri r2 = r10.a()     // Catch: java.lang.Throwable -> L7c
            ffbr r3 = r8.h     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L7c
            r3.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L7c
            java.lang.String[] r3 = r10.c(r3)     // Catch: java.lang.Throwable -> L7c
            ekrc r4 = r8.H()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "_id"
            I(r4, r5, r9)     // Catch: java.lang.Throwable -> L7c
            ekrb r4 = r4.a()     // Catch: java.lang.Throwable -> L7c
            axws r5 = new axws     // Catch: java.lang.Throwable -> L7c
            r5.<init>()     // Catch: java.lang.Throwable -> L7c
            r6.d = r11     // Catch: java.lang.Throwable -> L7c
            r6.c = r1     // Catch: java.lang.Throwable -> L7c
            r1 = r8
            java.lang.Object r9 = r1.C(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7c
            if (r9 == r0) goto L7b
            r7 = r11
            r11 = r9
            r9 = r7
        L76:
            r10 = 0
            defpackage.ffig.a(r9, r10)
            return r11
        L7b:
            return r0
        L7c:
            r0 = move-exception
            r9 = r0
            r10 = r9
            r9 = r11
        L80:
            throw r10     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            r11 = r0
            defpackage.ffig.a(r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.E(java.util.List, axwz, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0070, B:14:0x0077, B:17:0x009c, B:22:0x0082, B:23:0x0086, B:25:0x008c), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.axwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.axxh
            if (r0 == 0) goto L13
            r0 = r9
            axxh r0 = (defpackage.axxh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axxh r0 = new axxh
            r0.<init>(r8, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 != r7) goto L2d
            ekzz r1 = r6.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L70
        L2a:
            r0 = move-exception
            goto La8
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            defpackage.ffci.b(r9)
            ffhd r9 = r6.u()
            boolean r9 = defpackage.ekxi.b(r9)
            if (r9 == 0) goto Laf
            java.lang.String r9 = "Cp2DataService#hasManagedProfileContactDirectory"
            ekzz r9 = defpackage.eleg.f(r9)
            android.net.Uri r2 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m91m()     // Catch: java.lang.Throwable -> La6
            r2.getClass()     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> La6
            ekrc r1 = new ekrc     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            ekrb r4 = r1.a()     // Catch: java.lang.Throwable -> La6
            axwl r5 = new axwl     // Catch: java.lang.Throwable -> La6
            r5.<init>()     // Catch: java.lang.Throwable -> La6
            r6.d = r9     // Catch: java.lang.Throwable -> La6
            r6.c = r7     // Catch: java.lang.Throwable -> La6
            r1 = r8
            java.lang.Object r2 = r1.C(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La6
            if (r2 == r0) goto La5
            r1 = r9
            r9 = r2
        L70:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r9 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r0 == 0) goto L82
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L82
        L80:
            r7 = r2
            goto L9c
        L82:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2a
        L86:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L80
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L2a
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2a
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L86
        L9c:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.ffig.a(r1, r0)
            return r9
        La5:
            return r0
        La6:
            r0 = move-exception
            r1 = r9
        La8:
            r9 = r0
            throw r9     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            defpackage.ffig.a(r1, r9)
            throw r0
        Laf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.axwk
    public final Object b(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axxi(null, this), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object c(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axxj(null, this), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object d(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axxm(null, this), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object e(Instant instant, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axxq(null, this, instant), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object f(Instant instant, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axxr(null, instant, this), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object g(Instant instant, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axxt(null, instant, this), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.axwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(j$.time.Instant r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.axxv
            if (r0 == 0) goto L13
            r0 = r12
            axxv r0 = (defpackage.axxv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axxv r0 = new axxv
            r0.<init>(r10, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            ekzz r11 = r7.d
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L2b
            goto L8e
        L2b:
            r0 = move-exception
            r12 = r0
            goto L9a
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            defpackage.ffci.b(r12)
            ffhd r12 = r7.u()
            boolean r12 = defpackage.ekxi.b(r12)
            if (r12 == 0) goto La0
            java.lang.String r12 = "Cp2DataService#queryChangedEnterpriseContacts"
            ekzz r12 = defpackage.eleg.f(r12)
            axwz r1 = defpackage.axwz.a     // Catch: java.lang.Throwable -> L95
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L56
            if (r1 == r2) goto L55
            throw r8     // Catch: java.lang.Throwable -> L95
        L55:
            throw r8     // Catch: java.lang.Throwable -> L95
        L56:
            r1 = r2
            android.net.Uri r2 = defpackage.aak$$ExternalSyntheticApiModelOutline0.m25m$1()     // Catch: java.lang.Throwable -> L95
            r2.getClass()     // Catch: java.lang.Throwable -> L95
            axwz r3 = defpackage.axwz.a     // Catch: java.lang.Throwable -> L95
            ffbr r4 = r10.h     // Catch: java.lang.Throwable -> L95
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L95
            r4.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L95
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L95
            java.lang.String[] r3 = r3.c(r4)     // Catch: java.lang.Throwable -> L95
            axwz r4 = defpackage.axwz.a     // Catch: java.lang.Throwable -> L95
            ekrb r4 = r10.t(r11, r4)     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = "contact_id ASC"
            axwq r6 = new axwq     // Catch: java.lang.Throwable -> L95
            r6.<init>()     // Catch: java.lang.Throwable -> L95
            r7.d = r12     // Catch: java.lang.Throwable -> L95
            r7.c = r1     // Catch: java.lang.Throwable -> L95
            r1 = r10
            java.lang.Object r11 = r1.v(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L95
            if (r11 == r0) goto L94
            r9 = r12
            r12 = r11
            r11 = r9
        L8e:
            axxa r12 = (defpackage.axxa) r12     // Catch: java.lang.Throwable -> L2b
            defpackage.ffig.a(r11, r8)
            return r12
        L94:
            return r0
        L95:
            r0 = move-exception
            r11 = r0
            r9 = r12
            r12 = r11
            r11 = r9
        L9a:
            throw r12     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            defpackage.ffig.a(r11, r12)
            throw r0
        La0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.h(j$.time.Instant, ffgu):java.lang.Object");
    }

    @Override // defpackage.axwk
    public final Object i(List list, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axxz(null, list, this), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object j(List list, ffgu ffguVar) {
        Object b2 = this.q.b();
        b2.getClass();
        return ffra.a(ekxi.a((ffhd) b2), new axyd(null, list, this), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object k(List list, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axyf(null, this, list), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object l(Instant instant, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axym(null, instant, this), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.axwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(j$.time.Instant r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.axyp
            if (r0 == 0) goto L13
            r0 = r7
            axyp r0 = (defpackage.axyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axyp r0 = new axyp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.o
            ffhd r7 = defpackage.ekxi.a(r7)
            axyo r2 = new axyo
            r4 = 0
            r2.<init>(r4, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.m(j$.time.Instant, ffgu):java.lang.Object");
    }

    @Override // defpackage.axwk
    public final Object n(Instant instant, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.o), new axyr(null, instant, this), ffguVar);
    }

    @Override // defpackage.axwk
    public final Object o(List list, ffgu ffguVar) {
        return ekxl.a(this.o, new axyt(this, list, null), ffguVar);
    }

    @Override // defpackage.axwk
    @ffbs
    public final List p(aoku aokuVar) {
        axxb axxbVar;
        List list;
        List arrayList;
        ekzz f = eleg.f("Cp2DataService#lookupMatchingContactsSync");
        try {
            String j2 = aokuVar.j();
            if (j2.length() == 0) {
                j2 = null;
            }
            if (j2 == null) {
                axxbVar = null;
            } else {
                final axwz axwzVar = aokuVar.a() == aoqz.EMAIL ? axwz.b : axwz.a;
                boolean z = ((atfe) this.s.b()).a() && Build.VERSION.SDK_INT >= 34;
                int ordinal = axwzVar.ordinal();
                if (ordinal == 0) {
                    axxbVar = new axxb(axwzVar.b(j2, z), i, new ekrc().a(), new ffji() { // from class: axwt
                        /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
                        @Override // defpackage.ffji
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r25) {
                            /*
                                r24 = this;
                                r0 = r25
                                android.database.Cursor r0 = (android.database.Cursor) r0
                                java.lang.String[] r1 = defpackage.axyy.a
                                r0.getClass()
                                r1 = 0
                                long r3 = r0.getLong(r1)
                                r1 = 1
                                long r5 = r0.getLong(r1)
                                r2 = 2
                                java.lang.String r7 = r0.getString(r2)
                                r2 = 3
                                java.lang.String r2 = r0.getString(r2)
                                r8 = 4
                                java.lang.String r8 = r0.getString(r8)
                                r9 = 5
                                java.lang.String r14 = r0.getString(r9)
                                r9 = 6
                                java.lang.String r15 = r0.getString(r9)
                                r9 = 7
                                int r17 = r0.getInt(r9)
                                r9 = 8
                                boolean r10 = r0.isNull(r9)
                                r11 = 0
                                if (r10 == 0) goto L3c
                                r9 = r11
                                goto L40
                            L3c:
                                java.lang.String r9 = r0.getString(r9)
                            L40:
                                if (r9 == 0) goto L4c
                                boolean r10 = defpackage.ffpc.J(r9)
                                if (r1 != r10) goto L49
                                goto L4c
                            L49:
                                r18 = r9
                                goto L4e
                            L4c:
                                r18 = r11
                            L4e:
                                r1 = 9
                                java.lang.String r19 = r0.getString(r1)
                                r1 = 10
                                java.lang.String r20 = r0.getString(r1)
                                r1 = 11
                                boolean r9 = r0.isNull(r1)
                                if (r9 == 0) goto L63
                                goto L6b
                            L63:
                                int r0 = r0.getInt(r1)
                                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
                            L6b:
                                r21 = r11
                                if (r8 != 0) goto L77
                                if (r14 != 0) goto L74
                                java.lang.String r8 = ""
                                goto L77
                            L74:
                                r0 = r2
                                r12 = r14
                                goto L79
                            L77:
                                r0 = r2
                                r12 = r8
                            L79:
                                axxd r2 = new axxd
                                r7.getClass()
                                if (r0 != 0) goto L82
                                r8 = r12
                                goto L83
                            L82:
                                r8 = r0
                            L83:
                                r16 = 0
                                r22 = 0
                                java.lang.String r9 = ""
                                r10 = 0
                                r13 = 0
                                r2.<init>(r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.axwt.invoke(java.lang.Object):java.lang.Object");
                        }
                    });
                } else {
                    if (ordinal != 1) {
                        throw new ffcd();
                    }
                    Uri b2 = axwzVar.b(j2, z);
                    Object b3 = this.h.b();
                    b3.getClass();
                    axxbVar = new axxb(b2, axwzVar.c(((Boolean) b3).booleanValue()), r(axwzVar), new ffji() { // from class: axwu
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            Cursor cursor = (Cursor) obj;
                            cursor.getClass();
                            return axyy.this.q(cursor, axwzVar);
                        }
                    });
                }
            }
            if (axxbVar != null) {
                Uri uri = axxbVar.a;
                String[] strArr = axxbVar.b;
                ekrb ekrbVar = axxbVar.c;
                ffji ffjiVar = axxbVar.d;
                Context context = this.n;
                String a2 = ekrbVar.a();
                Object[] b4 = ekrbVar.b();
                b4.getClass();
                ArrayList arrayList2 = new ArrayList(b4.length);
                for (Object obj : b4) {
                    arrayList2.add(obj.toString());
                }
                Cursor a3 = new bcqd(context, uri, strArr, a2, (String[]) arrayList2.toArray(new String[0]), null).a();
                if (a3 != null) {
                    try {
                        if (a3.moveToFirst()) {
                            arrayList = new ArrayList();
                            do {
                                Object invoke = ffjiVar.invoke(a3);
                                if (invoke != null) {
                                    arrayList.add(invoke);
                                }
                            } while (a3.moveToNext());
                            ffig.a(a3, null);
                            ffem ffemVar = ffem.a;
                            list = G(arrayList, ffemVar, ffemVar, enet.a);
                        }
                    } finally {
                    }
                }
                arrayList = ffel.a;
                ffig.a(a3, null);
                ffem ffemVar2 = ffem.a;
                list = G(arrayList, ffemVar2, ffemVar2, enet.a);
            } else {
                list = ffel.a;
            }
            ffig.a(f, null);
            return list;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.axxd q(android.database.Cursor r28, defpackage.axwz r29) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.q(android.database.Cursor, axwz):axxd");
    }

    public final ekrb r(axwz axwzVar) {
        ekrc H = H();
        J(H, axwzVar);
        return H.a();
    }

    public final ekrb s(List list, axwz axwzVar) {
        ekrc H = H();
        I(H, "contact_id", list);
        H.b(" AND ");
        J(H, axwzVar);
        return H.a();
    }

    public final ekrb t(Instant instant, axwz axwzVar) {
        ekrc H = H();
        H.b("contact_last_updated_timestamp > ? AND ");
        J(H, axwzVar);
        H.c(String.valueOf(instant.toEpochMilli()));
        return H.a();
    }

    public final ekrb u(List list, axwz axwzVar) {
        ekrc H = H();
        I(H, "_id", list);
        H.b(" AND ");
        J(H, axwzVar);
        return H.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(android.net.Uri r5, java.lang.String[] r6, defpackage.ekrb r7, java.lang.String r8, defpackage.ffji r9, defpackage.ffgu r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.axxg
            if (r0 == 0) goto L13
            r0 = r10
            axxg r0 = (defpackage.axxg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axxg r0 = new axxg
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axwq r9 = r0.d
            defpackage.ffci.b(r10)
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r10)
            ejtr r10 = r4.e
            erph r5 = r10.a(r5, r6, r7, r8)
            ffbr r6 = r4.p
            java.lang.Object r6 = r6.b()
            r6.getClass()
            ffsk r6 = (defpackage.ffsk) r6
            ffss r5 = defpackage.axnh.b(r5, r6)
            r6 = r9
            axwq r6 = (defpackage.axwq) r6
            r0.d = r6
            r0.c = r3
            ffuq r5 = (defpackage.ffuq) r5
            java.lang.Object r10 = r5.B(r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            android.database.Cursor r10 = (android.database.Cursor) r10
            axxa r5 = new axxa
            r10.getClass()
            r5.<init>(r10, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.v(android.net.Uri, java.lang.String[], ekrb, java.lang.String, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(j$.time.Instant r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.axxp
            if (r0 == 0) goto L13
            r0 = r10
            axxp r0 = (defpackage.axxp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axxp r0 = new axxp
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            ekzz r9 = r6.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r0 = move-exception
            r10 = r0
            goto L83
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "Cp2DataService#queryChangedContactIds"
            ekzz r10 = defpackage.eleg.f(r10)
            ekrc r1 = new ekrc     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "contact_last_updated_timestamp > ?"
            r1.b(r3)     // Catch: java.lang.Throwable -> L7e
            long r3 = r9.toEpochMilli()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L7e
            r1.c(r9)     // Catch: java.lang.Throwable -> L7e
            ekrb r4 = r1.a()     // Catch: java.lang.Throwable -> L7e
            r9 = r2
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch: java.lang.Throwable -> L7e
            r2.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L7e
            axwp r5 = new axwp     // Catch: java.lang.Throwable -> L7e
            r5.<init>()     // Catch: java.lang.Throwable -> L7e
            r6.d = r10     // Catch: java.lang.Throwable -> L7e
            r6.c = r9     // Catch: java.lang.Throwable -> L7e
            r1 = r8
            java.lang.Object r9 = r1.C(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7e
            if (r9 == r0) goto L7d
            r7 = r10
            r10 = r9
            r9 = r7
        L76:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.ffig.a(r9, r0)
            return r10
        L7d:
            return r0
        L7e:
            r0 = move-exception
            r9 = r0
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            throw r10     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            defpackage.ffig.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.w(j$.time.Instant, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x007a, B:13:0x0085, B:15:0x008b, B:17:0x009e, B:19:0x00a6, B:22:0x00ac, B:23:0x00bd, B:25:0x00c4, B:26:0x00de, B:28:0x00e4, B:32:0x00f2, B:34:0x00f6, B:35:0x00fa, B:36:0x00fe, B:38:0x0104, B:42:0x0111, B:44:0x0115, B:46:0x0117, B:56:0x0129), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x007a, B:13:0x0085, B:15:0x008b, B:17:0x009e, B:19:0x00a6, B:22:0x00ac, B:23:0x00bd, B:25:0x00c4, B:26:0x00de, B:28:0x00e4, B:32:0x00f2, B:34:0x00f6, B:35:0x00fa, B:36:0x00fe, B:38:0x0104, B:42:0x0111, B:44:0x0115, B:46:0x0117, B:56:0x0129), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.util.List r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.x(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[Catch: all -> 0x002a, LOOP:0: B:13:0x0082->B:15:0x0088, LOOP_END, TryCatch #1 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0071, B:13:0x0082, B:15:0x0088, B:17:0x009d), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.util.List r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.axxx
            if (r0 == 0) goto L13
            r0 = r10
            axxx r0 = (defpackage.axxx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axxx r0 = new axxx
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            ekzz r9 = r6.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L71
        L2a:
            r0 = move-exception
            r10 = r0
            goto Lac
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "Cp2DataService#queryContactNames"
            ekzz r10 = defpackage.eleg.f(r10)
            r1 = r2
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch: java.lang.Throwable -> La7
            r2.getClass()     // Catch: java.lang.Throwable -> La7
            java.lang.String[] r3 = defpackage.axyy.j     // Catch: java.lang.Throwable -> La7
            ekrc r4 = r8.H()     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "raw_contact_id"
            I(r4, r5, r9)     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = "AND mimetype = ?"
            r4.b(r9)     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = "vnd.android.cursor.item/name"
            r4.c(r9)     // Catch: java.lang.Throwable -> La7
            ekrb r4 = r4.a()     // Catch: java.lang.Throwable -> La7
            axwv r5 = new axwv     // Catch: java.lang.Throwable -> La7
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            r6.d = r10     // Catch: java.lang.Throwable -> La7
            r6.c = r1     // Catch: java.lang.Throwable -> La7
            r1 = r8
            java.lang.Object r9 = r1.C(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La7
            if (r9 == r0) goto La6
            r7 = r10
            r10 = r9
            r9 = r7
        L71:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r1 = 10
            int r1 = defpackage.ffdx.n(r10, r1)     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2a
        L82:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L2a
            axxf r1 = (defpackage.axxf) r1     // Catch: java.lang.Throwable -> L2a
            long r2 = r1.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            ffcf r3 = new ffcf     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2a
            r0.add(r3)     // Catch: java.lang.Throwable -> L2a
            goto L82
        L9d:
            java.util.Map r10 = defpackage.ffew.k(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.ffig.a(r9, r0)
            return r10
        La6:
            return r0
        La7:
            r0 = move-exception
            r9 = r0
            r7 = r10
            r10 = r9
            r9 = r7
        Lac:
            throw r10     // Catch: java.lang.Throwable -> Lad
        Lad:
            r0 = move-exception
            defpackage.ffig.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.y(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.util.List r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.axxy
            if (r0 == 0) goto L13
            r0 = r10
            axxy r0 = (defpackage.axxy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axxy r0 = new axxy
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            ekzz r9 = r6.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L73
        L2a:
            r0 = move-exception
            r10 = r0
            goto L7e
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "Cp2DataService#queryContactThirdPartyServices"
            ekzz r10 = defpackage.eleg.f(r10)
            r1 = r2
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            java.lang.String[] r3 = defpackage.axyy.l     // Catch: java.lang.Throwable -> L79
            ekrc r4 = new ekrc     // Catch: java.lang.Throwable -> L79
            r4.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "contact_id"
            I(r4, r5, r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = " AND "
            r4.b(r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "mimetype"
            java.util.List r5 = defpackage.axyy.m     // Catch: java.lang.Throwable -> L79
            I(r4, r9, r5)     // Catch: java.lang.Throwable -> L79
            ekrb r4 = r4.a()     // Catch: java.lang.Throwable -> L79
            axwm r5 = new axwm     // Catch: java.lang.Throwable -> L79
            r5.<init>()     // Catch: java.lang.Throwable -> L79
            r6.d = r10     // Catch: java.lang.Throwable -> L79
            r6.c = r1     // Catch: java.lang.Throwable -> L79
            r1 = r8
            java.lang.Object r9 = r1.C(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L79
            if (r9 == r0) goto L78
            r7 = r10
            r10 = r9
            r9 = r7
        L73:
            r0 = 0
            defpackage.ffig.a(r9, r0)
            return r10
        L78:
            return r0
        L79:
            r0 = move-exception
            r9 = r0
            r7 = r10
            r10 = r9
            r9 = r7
        L7e:
            throw r10     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            defpackage.ffig.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyy.z(java.util.List, ffgu):java.lang.Object");
    }
}
