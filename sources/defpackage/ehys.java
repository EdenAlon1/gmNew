package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GroupMember;
import com.google.android.rcs.client.messaging.GroupMember;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehys extends eiay {
    public eica a;
    public Optional b = Optional.empty();
    private String c;
    private boolean d;
    private byte e;

    @Override // defpackage.eiay
    public final GroupMember a() {
        String str;
        eica eicaVar;
        if (this.e == 1 && (str = this.c) != null && (eicaVar = this.a) != null) {
            return new AutoValue_GroupMember(str, eicaVar, this.b, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" displayName");
        }
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.e == 0) {
            sb.append(" isOwnUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eiay
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.c = str;
    }

    @Override // defpackage.eiay
    public final void c(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
