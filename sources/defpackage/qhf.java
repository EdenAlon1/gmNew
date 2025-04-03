package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qhf extends ffhv implements ffjm {
    final /* synthetic */ qci a;
    final /* synthetic */ Context b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhf(qci qciVar, Context context, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = qciVar;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qhf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        for (qdc qdcVar : this.a.c.values()) {
            qdcVar.getClass();
            if (qdcVar.e == null) {
                String str = qdcVar.d;
                if (ffpc.t(str, "data:") && ffpc.Q(str, "base64,", 0, false, 6) > 0) {
                    try {
                        String substring = str.substring(ffpc.P(str, ',', 0, 6) + 1);
                        substring.getClass();
                        byte[] decode = Base64.decode(substring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        qdcVar.e = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e) {
                        qlp.b("data URL did not have correct base64 format.", e);
                    }
                }
            }
            Context context = this.b;
            String str2 = this.c;
            if (qdcVar.e == null && str2 != null) {
                String str3 = qdcVar.d;
                try {
                    InputStream open = context.getAssets().open(str2 + str3);
                    open.getClass();
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        qdcVar.e = qlw.d(BitmapFactory.decodeStream(open, null, options2), qdcVar.a, qdcVar.b);
                    } catch (IllegalArgumentException e2) {
                        qlp.b("Unable to decode image.", e2);
                    }
                } catch (IOException e3) {
                    qlp.b("Unable to open asset.", e3);
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qhf(this.a, this.b, this.c, ffguVar);
    }
}
