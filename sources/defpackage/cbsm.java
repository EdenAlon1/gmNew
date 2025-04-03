package defpackage;

import com.google.android.gms.appdatasearch.QuerySpecification;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbsm extends cbsp {
    final /* synthetic */ ArrayList a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbsm(cbsq cbsqVar, List list, QuerySpecification querySpecification, Executor executor, kfb kfbVar, elbx elbxVar, ArrayList arrayList) {
        super(cbsqVar, list, querySpecification, executor, kfbVar, elbxVar, null);
        this.a = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r6.a.add(r5);
     */
    @Override // defpackage.cbsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dewq r7) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            java.lang.String r1 = "lookup_key"
            java.lang.String r2 = "participant_id"
            java.lang.String r3 = "fetaQueryPair> rechParticipantSearchResults.SearchQuery#processResult"
            ekzz r3 = defpackage.eleg.f(r3)
            java.util.Map r7 = defpackage.cbsq.d(r7)     // Catch: java.lang.Throwable -> L44
            boolean r4 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> L44
            r5 = 0
            if (r4 == 0) goto L39
            boolean r4 = r7.containsKey(r1)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L39
            boolean r4 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L24
            goto L39
        L24:
            java.lang.String r2 = defpackage.cbsq.c(r7, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = defpackage.cbsq.c(r7, r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = defpackage.cbsq.c(r7, r1)     // Catch: java.lang.Throwable -> L44
            cbmf r5 = new cbmf     // Catch: java.lang.Throwable -> L44
            long r1 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L44
            r5.<init>(r1, r0, r7)     // Catch: java.lang.Throwable -> L44
        L39:
            if (r5 == 0) goto L40
            java.util.ArrayList r7 = r6.a     // Catch: java.lang.Throwable -> L44
            r7.add(r5)     // Catch: java.lang.Throwable -> L44
        L40:
            r3.close()
            return
        L44:
            r7 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r0 = move-exception
            r7.addSuppressed(r0)
        L4d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbsm.b(dewq):void");
    }

    @Override // defpackage.cbsp
    public final void c(String str, kfb kfbVar) {
        kfbVar.c(new cbse(str, this.a));
    }

    @Override // defpackage.cbsp
    public final void d(kfb kfbVar) {
        kfbVar.b(this.a);
    }
}
