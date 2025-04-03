package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgtp b;
    final /* synthetic */ ParticipantsTable.BindData c;
    final /* synthetic */ cuwf d;
    final /* synthetic */ List e;
    final /* synthetic */ cuwr f;
    final /* synthetic */ culh g;
    final /* synthetic */ fbcx h;
    Object i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuwe(ffgu ffguVar, fgtp fgtpVar, ParticipantsTable.BindData bindData, cuwf cuwfVar, List list, cuwr cuwrVar, culh culhVar, fbcx fbcxVar) {
        super(2, ffguVar);
        this.b = fgtpVar;
        this.c = bindData;
        this.d = cuwfVar;
        this.e = list;
        this.f = cuwrVar;
        this.g = culhVar;
        this.h = fbcxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuwe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0068, code lost:
    
        if (r2 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x04ab, code lost:
    
        if (r2 != r0) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x04ba  */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.io.Closeable] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuwe cuweVar = new cuwe(ffguVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        cuweVar.j = obj;
        return cuweVar;
    }
}
