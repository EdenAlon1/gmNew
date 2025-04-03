package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class crvh {
    protected final ffbr a;

    public crvh(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static final void k(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            throw new csgv("Missing dependency even after check dependency first\n", engw.r(new csgn(str, i)));
        }
    }

    public static final void l(byte[] bArr, bqvj bqvjVar, esii esiiVar) {
        byte[] q = bqvjVar.q();
        if (q == null) {
            throw new crvu("No encryption key available in cmsTable");
        }
        int k = bqvjVar.k();
        try {
            byte[] b = crvx.b(bArr, q);
            esiiVar.copyOnWrite();
            esij esijVar = (esij) esiiVar.instance;
            esij esijVar2 = esij.a;
            esijVar.c = k;
            eyee x = eyee.x(b);
            esiiVar.copyOnWrite();
            ((esij) esiiVar.instance).b = x;
        } catch (Exception e) {
            throw new crvw(a.h(k, "Unable to encrypt content with key index "), e);
        }
    }
}
