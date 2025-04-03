package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxj implements ccuq {
    public static final /* synthetic */ int f = 0;
    public final csbl b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final csaj g;
    private final ffhd h;
    private final crzd i;

    public ccxj(csaj csajVar, csbl csblVar, ffbr ffbrVar, ffhd ffhdVar, crzd crzdVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffhdVar.getClass();
        crzdVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.g = csajVar;
        this.b = csblVar;
        this.c = ffbrVar;
        this.h = ffhdVar;
        this.i = crzdVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
    }

    private final void h(crzp crzpVar) {
        if (TextUtils.isEmpty(crzpVar.a().aj())) {
            bdhg E = crzpVar.a().E();
            String d = E != null ? bdhg.d(E) : null;
            if (d != null && d.length() > 0) {
                crzpVar.a().bq(this.i.c(d));
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("maybePopulateCmsCorrelationId_rcsMessageIdHmac");
                buxrVar.j(crzpVar.a().aj());
                if (buxrVar.e(crzpVar.a().B())) {
                    return;
                }
                String b = crzpVar.a().B().b();
                b.getClass();
                throw new ccwp(b);
            }
            UUID randomUUID = UUID.randomUUID();
            Objects.toString(randomUUID);
            String valueOf = String.valueOf(randomUUID);
            MessageIdType B = crzpVar.a().B();
            String[] strArr2 = MessagesTable.a;
            buxr buxrVar2 = new buxr();
            buxrVar2.ap("maybePopulateCmsCorrelationId");
            String concat = "cms:".concat(valueOf);
            buxrVar2.j(concat);
            if (buxrVar2.e(B)) {
                crzpVar.a().bq(concat);
            } else {
                if (((asix) this.e.b()).a()) {
                    String b2 = B.b();
                    b2.getClass();
                    throw new ccwp(b2, this.d);
                }
                String b3 = B.b();
                b3.getClass();
                throw new ccwp(b3);
            }
        }
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ csgg a(Object obj) {
        crzp crzpVar = (crzp) obj;
        crzpVar.getClass();
        return crzpVar.a().V();
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ Object b(Object obj, bqvj bqvjVar, boolean z, EnumSet enumSet, ffgu ffguVar) {
        return g((crzp) obj, bqvjVar, z, ffguVar);
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        crzp crzpVar = (crzp) obj;
        crzpVar.getClass();
        return crzpVar.a().ak();
    }

    @Override // defpackage.ccuq
    public final Map e(Collection collection, EnumSet enumSet) {
        ccwp ccwpVar;
        collection.getClass();
        enumSet.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(bdhb.b((String) it.next()));
        }
        final csaj csajVar = this.g;
        final List ak = ffdx.ak(arrayList);
        enhk enhkVar = (enhk) csajVar.i.c("CmsMessageObjectFetcher#fetchCmsMessageObjectData-batch", new emyl() { // from class: crzr
            /* JADX WARN: Removed duplicated region for block: B:22:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0351  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x03e3  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0450  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x03da  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x027b  */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 1215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.crzr.get():java.lang.Object");
            }
        });
        enhkVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(enhkVar.size()));
        for (Map.Entry entry : enhkVar.entrySet()) {
            linkedHashMap.put(((MessageIdType) entry.getKey()).b(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffew.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            crzp crzpVar = (crzp) entry2.getValue();
            crzpVar.getClass();
            h(crzpVar);
            linkedHashMap2.put(key, new ffch(crzpVar));
        }
        Set e = fffi.e(ffdx.ar(collection), linkedHashMap2.keySet());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(e, 10)), 16));
        for (Object obj : e) {
            String str = (String) obj;
            if (((asix) this.e.b()).a()) {
                str.getClass();
                ccwpVar = new ccwp(str, this.d);
            } else {
                str.getClass();
                ccwpVar = new ccwp(str);
            }
            linkedHashMap3.put(obj, new ffch(ffci.a(ccwpVar)));
        }
        return ffew.j(linkedHashMap2, linkedHashMap3);
    }

    @Override // defpackage.ccuq
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final crzp c(final String str, EnumSet enumSet) {
        str.getClass();
        enumSet.getClass();
        efbd.b();
        Object orElseThrow = this.g.f(bdhb.b(str)).orElseThrow(new Supplier() { // from class: ccxg
            @Override // java.util.function.Supplier
            public final Object get() {
                ccxj ccxjVar = ccxj.this;
                boolean a = ((asix) ccxjVar.e.b()).a();
                String str2 = str;
                return a ? new ccwp(str2, ccxjVar.d) : new ccwp(str2);
            }
        });
        crzp crzpVar = (crzp) orElseThrow;
        crzpVar.getClass();
        h(crzpVar);
        orElseThrow.getClass();
        return crzpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.crzp r11, defpackage.bqvj r12, boolean r13, defpackage.ffgu r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.ccxi
            if (r0 == 0) goto L13
            r0 = r14
            ccxi r0 = (defpackage.ccxi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccxi r0 = new ccxi
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r14)
            goto L4b
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r14)
            ffhd r14 = r10.h
            ffhd r14 = defpackage.ekxi.a(r14)
            ccxh r4 = new ccxh
            r5 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r14 = defpackage.ffra.a(r14, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r14.getClass()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxj.g(crzp, bqvj, boolean, ffgu):java.lang.Object");
    }
}
