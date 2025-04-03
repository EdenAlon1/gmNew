package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fifd extends fifc implements fiez {
    public fifd(int i) {
        super(i, "UiThreadTaskRunner", 2);
    }

    @Override // defpackage.fifc
    protected final void c() {
        ThreadUtils.a().post(this.d);
    }
}
