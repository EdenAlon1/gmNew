package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcry extends vk {
    public final CarouselRecyclerView a;
    public int e;
    public final dcmx g;
    public int f = -1;
    public final List d = new ArrayList();

    protected dcry(CarouselRecyclerView carouselRecyclerView, dcmx dcmxVar) {
        this.a = carouselRecyclerView;
        this.g = dcmxVar;
    }

    public final void F(Object obj) {
        this.d.add(obj);
    }

    public final void G(int i) {
        if (i != this.e) {
            this.e = i;
            dcmx dcmxVar = this.g;
            Object obj = this.d.get(i);
            int i2 = this.f;
            dcmxVar.a.k(((dcqx) obj).a, true != (i2 < 0 || i2 != this.a.a()) ? 2 : 4);
            this.a.performHapticFeedback(0);
            this.f = -1;
        }
    }

    @Override // defpackage.vk
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 0;
    }

    @Override // defpackage.vk
    public void g(wr wrVar, int i) {
        throw null;
    }

    public int m(View view) {
        throw null;
    }
}
