package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbm extends vk {
    private final Context a;
    private final List d;
    private final ellq e;
    private final int f;

    public acbm(Context context, List list, ellq ellqVar) {
        this.a = context;
        this.d = list;
        this.e = ellqVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorOnSurfaceVariant});
        this.f = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.vk
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new acbl(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.datetime_picker_preset_item, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        acbl acblVar = (acbl) wrVar;
        acbo acboVar = (acbo) this.d.get(i);
        String string = this.a.getResources().getString(acboVar.b().h, acboVar.c());
        Drawable drawable = this.a.getDrawable(acboVar.b().g);
        drawable.setTint(this.f);
        acblVar.s.setText(string);
        acblVar.s.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.e.b(acblVar.s, new accr(i));
    }
}
