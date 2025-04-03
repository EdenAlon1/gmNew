package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeoh implements aeoj {
    public final Function a;
    private final Context b;
    private final Map c;
    private final Paint d;
    private aeot e;
    private Drawable f;
    private float g;

    public aeoh(Context context, aeot aeotVar, aeot aeotVar2, Function function) {
        emxf.a(true);
        emxf.a(true);
        this.b = context;
        this.e = aeotVar;
        this.g = 0.0f;
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(ehdr.d(context, R.attr.colorPrimary, "SwipeActionCallback"));
        this.a = function;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put(aeotVar, Optional.empty());
        hashMap.put(aeotVar2, Optional.empty());
    }

    @Override // defpackage.aeoj
    public final void a() {
        if (this.c.containsValue(Optional.empty())) {
            for (aeot aeotVar : this.c.keySet()) {
                Drawable b = aeotVar.b();
                aeotVar.c(b, ehdr.d(this.b, R.attr.colorOnPrimary, "SwipeActionCallback"));
                this.c.put(aeotVar, Optional.of(b));
            }
            c(this.e);
        }
    }

    @Override // defpackage.aeoj
    public final void b(Canvas canvas, RecyclerView recyclerView, wr wrVar, float f, boolean z) {
        aeny aenyVar = new aeny();
        aenyVar.a = this.b;
        aenyVar.f(this.e);
        aenyVar.e(this.f);
        aenyVar.b = this.d;
        aenyVar.b(canvas);
        aenyVar.c = recyclerView;
        aenyVar.d = wrVar;
        aenyVar.c(f);
        aenyVar.d(this.g);
        aenyVar.g(z);
        aenyVar.h();
        this.g = aeoi.a(aenyVar.a());
    }

    public final void c(aeot aeotVar) {
        emxf.a(this.c.containsKey(aeotVar));
        Optional optional = (Optional) this.c.get(aeotVar);
        if (optional == null || !optional.isPresent()) {
            return;
        }
        this.e = aeotVar;
        this.f = (Drawable) optional.get();
    }
}
