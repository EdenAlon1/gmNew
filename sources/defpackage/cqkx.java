package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqkx implements cpws {
    public static final /* synthetic */ int b = 0;
    private final comc d;
    private final coxk e;
    private final ffbr f;
    private final Context g;
    private final cqlc h;
    private static final cskc c = cskc.g("Bugle", "PartTableDetectionHeuristic");
    static final cfva a = cfvl.r(153021568, "restore_settings_after_bugle_wipeout");

    public cqkx(Context context, comy comyVar, coxk coxkVar, ffbr ffbrVar) {
        this.g = context;
        comu c2 = comv.c();
        c2.d(comb.PART_WIPEOUT_HEURISTIC);
        c2.f(cqkz.a);
        comc a2 = comyVar.a(c2.a());
        this.d = a2;
        this.e = coxkVar;
        this.f = ffbrVar;
        this.h = new cqlc(context, a2);
    }

    private final void b() {
        this.h.a(Uri.parse("content://mms/2047483647/part"), new cqlb() { // from class: cqkw
            @Override // defpackage.cqlb
            public final Object a(Object obj, Uri uri, String str) {
                int i = cqkx.b;
                cqky cqkyVar = (cqky) ((cqkz) obj).toBuilder();
                String uri2 = uri.toString();
                cqkyVar.copyOnWrite();
                cqkz cqkzVar = (cqkz) cqkyVar.instance;
                uri2.getClass();
                cqkzVar.b = uri2;
                cqkyVar.copyOnWrite();
                cqkz cqkzVar2 = (cqkz) cqkyVar.instance;
                str.getClass();
                cqkzVar2.c = str;
                return (cqkz) cqkyVar.build();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2 A[Catch: eygu -> 0x0139, TRY_ENTER, TryCatch #2 {eygu -> 0x0139, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x003c, B:7:0x0051, B:10:0x0056, B:15:0x00d2, B:16:0x00d5, B:18:0x00db, B:20:0x00e9, B:22:0x00f1, B:23:0x00fb, B:25:0x0104, B:27:0x010c, B:29:0x011b, B:41:0x0138, B:40:0x0135, B:36:0x0130, B:44:0x007d, B:46:0x0083, B:13:0x00cc), top: B:1:0x0000, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: eygu -> 0x0139, TryCatch #2 {eygu -> 0x0139, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x003c, B:7:0x0051, B:10:0x0056, B:15:0x00d2, B:16:0x00d5, B:18:0x00db, B:20:0x00e9, B:22:0x00f1, B:23:0x00fb, B:25:0x0104, B:27:0x010c, B:29:0x011b, B:41:0x0138, B:40:0x0135, B:36:0x0130, B:44:0x007d, B:46:0x0083, B:13:0x00cc), top: B:1:0x0000, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104 A[Catch: eygu -> 0x0139, TryCatch #2 {eygu -> 0x0139, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x003c, B:7:0x0051, B:10:0x0056, B:15:0x00d2, B:16:0x00d5, B:18:0x00db, B:20:0x00e9, B:22:0x00f1, B:23:0x00fb, B:25:0x0104, B:27:0x010c, B:29:0x011b, B:41:0x0138, B:40:0x0135, B:36:0x0130, B:44:0x007d, B:46:0x0083, B:13:0x00cc), top: B:1:0x0000, inners: #0, #1 }] */
    @Override // defpackage.cpws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional a() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.a():j$.util.Optional");
    }
}
