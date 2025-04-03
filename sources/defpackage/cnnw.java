package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnnw {
    public static final cntb a(String str) {
        try {
            byte[] decode = Base64.decode(str, 3);
            decode.getClass();
            try {
                cntb cntbVar = (cntb) eyfy.parseFrom(cntb.a, decode, eyfc.a());
                cntbVar.getClass();
                return cntbVar;
            } catch (eygu e) {
                throw new cnnx("Malformed raw proto", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new cnnx("Not a Base64 encoded string", e2);
        }
    }
}
