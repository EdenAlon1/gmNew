package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AutoValue_CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyj extends eiad {
    private PendingIntent a;
    private String b;
    private String c;
    private engw d;
    private Optional e = Optional.empty();

    @Override // defpackage.eiad
    public final CreateGroupRequest a() {
        String str;
        String str2;
        engw engwVar;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (str = this.b) != null && (str2 = this.c) != null && (engwVar = this.d) != null) {
            return new AutoValue_CreateGroupRequest(pendingIntent, str, str2, engwVar, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" id");
        }
        if (this.c == null) {
            sb.append(" subject");
        }
        if (this.d == null) {
            sb.append(" member");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eiad
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.b = str;
    }

    @Override // defpackage.eiad
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }

    @Override // defpackage.eiad
    public final void d(List list) {
        this.d = engw.n(list);
    }

    @Override // defpackage.eiad
    public final void e(eyee eyeeVar) {
        this.e = Optional.of(eyeeVar);
    }

    @Override // defpackage.eiad
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null subject");
        }
        this.c = str;
    }
}
