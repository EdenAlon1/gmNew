package defpackage;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kzo extends kzl {
    private final int a;
    private final int e;
    private final LayoutInflater f;

    public kzo(Context context) {
        super(context);
        this.e = R.layout.simple_list_item_2;
        this.a = R.layout.simple_list_item_2;
        this.f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // defpackage.kzl
    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f.inflate(this.a, viewGroup, false);
    }

    @Override // defpackage.kzl
    public final View j(ViewGroup viewGroup) {
        return this.f.inflate(this.e, viewGroup, false);
    }

    @Deprecated
    public kzo(Context context, int i) {
        super(context, null);
        this.e = i;
        this.a = i;
        this.f = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
