package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eujb extends ThreadLocal {
    final /* synthetic */ eujc a;

    public eujb(eujc eujcVar) {
        this.a = eujcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) euil.b.a(this.a.a);
            mac.init(this.a.b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
