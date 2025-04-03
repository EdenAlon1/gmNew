package defpackage;

import android.content.Context;
import android.support.v4.app.FragmentContainerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljf implements ffji {
    private final int a;
    private FragmentContainerView b;

    public ljf(int i) {
        this.a = i;
    }

    public final FragmentContainerView a() {
        FragmentContainerView fragmentContainerView = this.b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException("AndroidView has not created a container for " + this.a + " yet");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.a);
        this.b = fragmentContainerView;
        return fragmentContainerView;
    }
}
