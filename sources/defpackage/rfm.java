package defpackage;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfm implements qtw {
    private static final rfl a = new rfl();
    private final Context b;
    private final List c;
    private final rfl d;
    private final rfn e;

    public rfm(Context context, List list, qxf qxfVar, qxd qxdVar) {
        rfl rflVar = a;
        this.b = context.getApplicationContext();
        this.c = list;
        this.e = new rfn(qxfVar, qxdVar);
        this.d = rflVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0393 A[Catch: all -> 0x03aa, TryCatch #0 {all -> 0x03aa, blocks: (B:3:0x0016, B:37:0x02ff, B:39:0x0305, B:40:0x031a, B:47:0x033e, B:49:0x0344, B:52:0x035b, B:54:0x0364, B:168:0x038d, B:170:0x0393, B:171:0x03a9), top: B:2:0x0016 }] */
    @Override // defpackage.qtw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.qwv a(java.lang.Object r19, int r20, int r21, defpackage.qtu r22) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfm.a(java.lang.Object, int, int, qtu):qwv");
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return !((Boolean) qtuVar.b(rfy.b)).booleanValue() && qto.c(this.c, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }
}
