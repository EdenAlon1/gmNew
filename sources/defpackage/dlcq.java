package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlcq implements dlcr {
    private final dkyw a;
    private final Optional b;

    public dlcq(dkyw dkywVar, Optional optional) {
        dkywVar.getClass();
        this.a = dkywVar;
        this.b = optional;
    }

    private static final byte[] b(dlcq dlcqVar, dlhd dlhdVar, eyee eyeeVar) {
        return dlcqVar.a.c(eyeeVar, dlhdVar.b);
    }

    @Override // defpackage.dlcr
    public final Object i(dlhd dlhdVar, ffgu ffguVar) {
        List<ewfp> list;
        ByteBuffer put;
        if (dlhdVar.e) {
            List list2 = dlhdVar.d;
            list = new ArrayList(ffdx.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ewfo ewfoVar = (ewfo) ((ewfp) it.next()).toBuilder();
                ewfoVar.getClass();
                eyee eyeeVar = ((ewfp) ewfoVar.instance).b;
                eyeeVar.getClass();
                ewfq.b(eyee.x(b(this, dlhdVar, eyeeVar)), ewfoVar);
                list.add(ewfq.a(ewfoVar));
            }
        } else {
            list = dlhdVar.d;
        }
        if (dlhdVar.c.H()) {
            int i = eodh.a;
            eodd f = eodf.a.f();
            eocq eocqVar = (eocq) f;
            eocqVar.a((byte) 0);
            eocqVar.a((byte) 2);
            for (ewfp ewfpVar : list) {
                ewfv b = ewfv.b(ewfpVar.c);
                if (b == null) {
                    b = ewfv.UNRECOGNIZED;
                }
                f.h(b.a());
                f.i(ewfpVar.b.d());
                eocqVar.b(ewfpVar.b.o());
            }
            byte[] e = f.q().e();
            e.getClass();
            return e;
        }
        this.b.isPresent();
        if (dlhdVar.e) {
            byte[] b2 = b(this, dlhdVar, dlhdVar.c);
            put = ByteBuffer.allocateDirect(b2.length).put(b2);
        } else {
            put = ByteBuffer.allocateDirect(dlhdVar.c.d()).put(dlhdVar.c.o());
        }
        ByteBuffer byteBuffer = put;
        this.b.get();
        byteBuffer.getClass();
        dlkz dlkzVar = dlhdVar.a;
        int i2 = dlkx.a;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((ewfp) list.get(i3)).c;
        }
        int size2 = list.size();
        byte[][] bArr = new byte[size2][];
        for (int i4 = 0; i4 < size2; i4++) {
            byte[] I = ((ewfp) list.get(i4)).b.I();
            I.getClass();
            bArr[i4] = I;
        }
        byte[] bArr2 = new byte[32];
        TartarusKt.hashScarAndProtectionComponentsV2(byteBuffer, dlkzVar.a, dlkzVar.b, dlkzVar.c, dlkzVar.d, iArr, bArr, bArr2);
        return bArr2;
    }
}
