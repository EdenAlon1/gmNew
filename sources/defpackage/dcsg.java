package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcsg extends dctk {
    private int a;
    private int b;
    private int c;
    private BaseMediaViewerEvent d;
    private byte e;

    @Override // defpackage.dctk
    public final MediaViewerButton a() {
        BaseMediaViewerEvent baseMediaViewerEvent;
        if (this.e == 7 && (baseMediaViewerEvent = this.d) != null) {
            return new dcsh(this.a, this.b, this.c, baseMediaViewerEvent);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" titleRes");
        }
        if ((this.e & 2) == 0) {
            sb.append(" buttonDescriptionRes");
        }
        if ((this.e & 4) == 0) {
            sb.append(" iconRes");
        }
        if (this.d == null) {
            sb.append(" event");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dctk
    public final void b(int i) {
        this.b = i;
        this.e = (byte) (this.e | 2);
    }

    @Override // defpackage.dctk
    public final void c(BaseMediaViewerEvent baseMediaViewerEvent) {
        if (baseMediaViewerEvent == null) {
            throw new NullPointerException("Null event");
        }
        this.d = baseMediaViewerEvent;
    }

    @Override // defpackage.dctk
    public final void d(int i) {
        this.c = i;
        this.e = (byte) (this.e | 4);
    }

    @Override // defpackage.dctk
    public final void e(int i) {
        this.a = i;
        this.e = (byte) (this.e | 1);
    }
}
