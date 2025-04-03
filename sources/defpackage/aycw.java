package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aycw {
    public static final ejoi d(poz pozVar, String str) {
        ejoe n = ejoi.n(aycz.class);
        poa poaVar = poa.EXPONENTIAL;
        Object e = axum.g.e();
        e.getClass();
        n.i(poaVar, new ejnw(((Number) e).longValue(), TimeUnit.MILLISECONDS));
        n.g(new ejnx(str == null ? "DELETED_CONTACTS_OBSERVER" : str, pozVar));
        if (str != null) {
            n.f(fffi.b("DELETED_CONTACTS_OBSERVER"));
        }
        poh pohVar = new poh();
        Uri uri = ContactsContract.DeletedContacts.CONTENT_URI;
        uri.getClass();
        pohVar.b(uri, false);
        n.d(pohVar.a());
        return n.h();
    }

    static /* synthetic */ ejoi e(poz pozVar) {
        return d(pozVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (defpackage.fgfz.c(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ejoc r8, boolean r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ayct
            if (r0 == 0) goto L13
            r0 = r10
            ayct r0 = (defpackage.ayct) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ayct r0 = new ayct
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r10)
            goto L8e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.b
            java.lang.Object r9 = r0.a
            defpackage.ffci.b(r10)
            goto L62
        L3d:
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r10)
            goto L59
        L43:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "DELETED_CONTACTS_OBSERVER"
            if (r9 == 0) goto L81
            com.google.common.util.concurrent.ListenableFuture r9 = r8.e(r10)
            r0.a = r8
            r0.e = r5
            java.lang.Object r10 = defpackage.fgfz.c(r9, r0)
            if (r10 != r1) goto L59
            goto L8d
        L59:
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r9 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r6
        L62:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r8.next()
            pqq r10 = (defpackage.pqq) r10
            java.util.UUID r10 = r10.a
            com.google.common.util.concurrent.ListenableFuture r10 = r9.b(r10)
            r0.a = r9
            r0.b = r8
            r0.e = r4
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 != r1) goto L62
            goto L8d
        L81:
            com.google.common.util.concurrent.ListenableFuture r8 = r8.a(r10)
            r0.e = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 != r1) goto L8e
        L8d:
            return r1
        L8e:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycw.a(ejoc, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.comc r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aycu
            if (r0 == 0) goto L13
            r0 = r6
            aycu r0 = (defpackage.aycu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aycu r0 = new aycu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            r0.c = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L4d
        L3a:
            axvx r6 = (defpackage.axvx) r6
            eyja r5 = r6.f
            if (r5 != 0) goto L42
            eyja r5 = defpackage.eyja.a
        L42:
            long r5 = defpackage.eykm.b(r5)
            java.lang.String r0 = "DELETED_CONTACTS_OBSERVER-"
            java.lang.String r5 = defpackage.a.s(r5, r0)
            return r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycw.b(comc, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ejoc r7, defpackage.comc r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aycv
            if (r0 == 0) goto L13
            r0 = r9
            aycv r0 = (defpackage.aycv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aycv r0 = new aycv
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            poz r8 = r0.e
            defpackage.ffci.b(r9)
            goto L54
        L3a:
            defpackage.ffci.b(r9)
            if (r8 == 0) goto L5b
            aycw r9 = defpackage.aycz.a
            poz r9 = defpackage.poz.KEEP
            aycw r2 = defpackage.aycz.a
            r0.e = r9
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 == r1) goto L72
            r5 = r9
            r9 = r8
            r8 = r5
        L54:
            java.lang.String r9 = (java.lang.String) r9
            ejoi r8 = d(r8, r9)
            goto L61
        L5b:
            poz r8 = defpackage.poz.CANCEL_AND_REENQUEUE
            ejoi r8 = e(r8)
        L61:
            com.google.common.util.concurrent.ListenableFuture r7 = r7.c(r8)
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = defpackage.fgfz.c(r7, r0)
            if (r9 != r1) goto L73
        L72:
            return r1
        L73:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycw.c(ejoc, comc, ffgu):java.lang.Object");
    }
}
