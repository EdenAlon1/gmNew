package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhh extends xhs {
    public String a;
    public List b;
    public String c;
    public boolean d;
    public MessageId e;
    public boolean f;
    public short g;
    public int h;

    @Override // defpackage.xhs
    public final void a(List list) {
        if (list == null) {
            throw new NullPointerException("Null attachments");
        }
        this.b = list;
        this.g = (short) (this.g | 2);
    }

    @Override // defpackage.xhs
    public final void b(boolean z) {
        this.f = z;
        this.g = (short) (this.g | 128);
    }

    @Override // defpackage.xhs
    public final void c(boolean z) {
        this.d = z;
        this.g = (short) (this.g | 8);
    }

    @Override // defpackage.xhs
    public final void d(String str) {
        this.c = str;
        this.g = (short) (this.g | 4);
    }

    @Override // defpackage.xhs
    public final void e(String str) {
        this.a = str;
        this.g = (short) (this.g | 1);
    }
}
