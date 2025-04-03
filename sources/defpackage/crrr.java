package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crrr extends crse {
    public Boolean a;
    public Boolean b;
    public cukx c;
    public ConversationIdType d;
    public ConversationId e;
    public String f;
    public boolean g;
    public eoko h;
    public byte i;
    public int j;
    public int k;
    public int l;

    @Override // defpackage.crse
    public final crsf a() {
        int i;
        int i2;
        int i3;
        if (this.i == 1 && (i = this.j) != 0 && (i2 = this.k) != 0 && (i3 = this.l) != 0) {
            return new crrs(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == 0) {
            sb.append(" allowExternalReporting");
        }
        if (this.j == 0) {
            sb.append(" scope");
        }
        if (this.k == 0) {
            sb.append(" entryPoint");
        }
        if (this.l == 0) {
            sb.append(" dialog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
