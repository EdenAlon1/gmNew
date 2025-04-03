package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvkj extends cvko {
    public MessageCoreData a;
    public Uri b;
    public int c;
    public byte d;
    private engw e;

    @Override // defpackage.cvko
    public final cvkp a() {
        MessageCoreData messageCoreData;
        Uri uri;
        engw engwVar;
        if (this.d == 3 && (messageCoreData = this.a) != null && (uri = this.b) != null && (engwVar = this.e) != null) {
            return new cvkk(messageCoreData, uri, this.c, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageCoreData");
        }
        if (this.b == null) {
            sb.append(" messageUri");
        }
        if ((this.d & 1) == 0) {
            sb.append(" subId");
        }
        if (this.e == null) {
            sb.append(" recipients");
        }
        if ((this.d & 2) == 0) {
            sb.append(" isRetry");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cvko
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null recipients");
        }
        this.e = engwVar;
    }
}
