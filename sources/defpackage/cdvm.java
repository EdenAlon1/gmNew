package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdvm implements cdve {
    public static final bvth[] a;
    public final ffbr b;
    private final ffbr c;

    static {
        bvtg bvtgVar = ParticipantsTable.c;
        a = new bvth[]{ParticipantsTable.c.a, bvtgVar.h, bvtgVar.f, bvtgVar.g, bvtgVar.n, bvtgVar.m, bvtgVar.E, bvtgVar.M, bvtgVar.G, bvtgVar.H, bvtgVar.v, bvtgVar.C, bvtgVar.D, bvtgVar.d};
    }

    public cdvm(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ffbrVar;
        this.b = ffbrVar2;
    }

    public static String b(ParticipantsTable.BindData bindData) {
        return "dest_" + bindData.U() + "_subId_" + bindData.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        if (r2.b(r13, defpackage.bdsp.j) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0158, code lost:
    
        if (r2.a(r13.b()) != 0) goto L45;
     */
    @Override // defpackage.cdve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r18, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r19) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdvm.a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData):void");
    }
}
