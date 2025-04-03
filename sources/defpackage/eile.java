package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eile extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eifm eifmVar = (eifm) obj;
        clok clokVar = (clok) clon.a.createBuilder();
        clnm clnmVar = (clnm) eimg.a.m().fP(eifmVar.b());
        clokVar.copyOnWrite();
        clon clonVar = (clon) clokVar.instance;
        clnmVar.getClass();
        clonVar.c = clnmVar;
        clonVar.b |= 1;
        c(eifmVar, clokVar);
        return (clon) clokVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        Uri uri;
        clon clonVar = (clon) obj;
        eiee eieeVar = new eiee();
        if ((clonVar.b & 1) != 0) {
            emwd emwdVar = eimg.a;
            clnm clnmVar = clonVar.c;
            if (clnmVar == null) {
                clnmVar = clnm.a;
            }
            ContentType contentType = (ContentType) emwdVar.fP(clnmVar);
            if (contentType == null) {
                throw new NullPointerException("Null contentType");
            }
            eieeVar.a = contentType;
        }
        if ((clonVar.b & 2) != 0) {
            d(clonVar, eieeVar);
        }
        ContentType contentType2 = eieeVar.a;
        if (contentType2 != null && (uri = eieeVar.b) != null) {
            return new eief(contentType2, uri);
        }
        StringBuilder sb = new StringBuilder();
        if (eieeVar.a == null) {
            sb.append(" contentType");
        }
        if (eieeVar.b == null) {
            sb.append(" contentUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public abstract void c(eifm eifmVar, clok clokVar);

    public abstract void d(clon clonVar, eifl eiflVar);
}
