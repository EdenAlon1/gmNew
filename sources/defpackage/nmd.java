package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmd implements nkj {
    private final luv a = new luv();
    private final luv b = new luv();
    private final nmc c;
    private Inflater d;

    public nmd(List list) {
        int i;
        nmc nmcVar = new nmc();
        this.c = nmcVar;
        for (String str : lvf.ag(new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim(), "\\r?\\n")) {
            if (str.startsWith("palette: ")) {
                String[] ag = lvf.ag(str.substring(9), ",");
                nmcVar.d = new int[ag.length];
                for (int i2 = 0; i2 < ag.length; i2++) {
                    int[] iArr = nmcVar.d;
                    try {
                        i = Integer.parseInt(ag[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] ag2 = lvf.ag(str.substring(6).trim(), "x");
                if (ag2.length == 2) {
                    try {
                        nmcVar.e = Integer.parseInt(ag2[0]);
                        nmcVar.f = Integer.parseInt(ag2[1]);
                        nmcVar.b = true;
                    } catch (RuntimeException e) {
                        luj.g("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.nkj
    public final /* synthetic */ njw a(byte[] bArr, int i, int i2) {
        return nkf.a(this, bArr, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f5  */
    @Override // defpackage.nkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, int r19, int r20, defpackage.nki r21, defpackage.lts r22) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmd.b(byte[], int, int, nki, lts):void");
    }

    @Override // defpackage.nkj
    public final /* synthetic */ void c() {
    }
}
