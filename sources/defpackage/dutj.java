package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutj extends vk {
    public dutk a;
    public int d = -1;
    public final dusl e;
    private final engw f;
    private final engw g;
    private final LayoutInflater h;
    private final Context i;
    private final duma j;
    private final int k;

    public dutj(Context context, emxg emxgVar, dusl duslVar, engw engwVar, int i) {
        this.i = context;
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.emoji_categories_icons);
        int i2 = engw.d;
        engr engrVar = new engr();
        for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
            emxgVar.a(Integer.valueOf(i3));
            engrVar.h(Integer.valueOf(obtainTypedArray.getResourceId(i3, 0)));
        }
        obtainTypedArray.recycle();
        enou enouVar = (enou) engwVar;
        int i4 = enouVar.c;
        for (int i5 = 0; i5 < i4; i5++) {
            engrVar.h(Integer.valueOf(((durg) engwVar.get(i5)).a()));
        }
        this.f = engrVar.g();
        TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(R.array.emoji_categories_content_desc);
        engr engrVar2 = new engr();
        for (int i6 = 0; i6 < obtainTypedArray2.length(); i6++) {
            emxgVar.a(Integer.valueOf(i6));
            engrVar2.h(context.getString(obtainTypedArray2.getResourceId(i6, 0)));
        }
        obtainTypedArray2.recycle();
        int i7 = enouVar.c;
        for (int i8 = 0; i8 < i7; i8++) {
            engrVar2.h(((durg) engwVar.get(i8)).b());
        }
        this.g = engrVar2.g();
        engr engrVar3 = new engr();
        int[] iArr = duoo.b;
        for (int i9 = 0; i9 < 10; i9++) {
            emxgVar.a(Integer.valueOf(i9));
            engrVar3.h(context.getString(iArr[i9]));
        }
        int i10 = enouVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            engrVar3.h(((durg) engwVar.get(i11)).c());
        }
        engrVar3.g();
        this.e = duslVar;
        this.j = duma.a(context);
        this.k = i;
        this.a = new duth();
        this.h = LayoutInflater.from(context);
    }

    @Override // defpackage.vk
    public final int a() {
        return ((enou) this.f).c;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new duti(this.h.inflate(1 != this.k ? R.layout.header_icon_text_holder : R.layout.header_icon_holder, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        duti dutiVar = (duti) wrVar;
        dutiVar.a.setOnClickListener(null);
        dutiVar.u.setImageDrawable(null);
        dutiVar.u.setContentDescription(null);
        TextView textView = dutiVar.t;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        dutiVar.C(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(duti dutiVar, final int i) {
        dutiVar.a.setOnClickListener(new View.OnClickListener() { // from class: dutg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dutj.this.e.a.e(i, 3);
            }
        });
        dutiVar.u.setImageDrawable(this.i.getDrawable(((Integer) this.f.get(i)).intValue()));
        duma.e(dutiVar.u, (CharSequence) this.g.get(i));
        TextView textView = dutiVar.t;
        if (textView != null) {
            textView.setText((CharSequence) this.g.get(i));
        }
        this.a.a(dutiVar.u, dutiVar.s, i == this.d);
        boolean z = i == this.d;
        this.a.a(dutiVar.u, dutiVar.s, z);
        if (z) {
            this.j.c(dutiVar.u.getContentDescription());
        }
        dutiVar.C(z);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void z(wr wrVar, int i, List list) {
        duti dutiVar = (duti) wrVar;
        View findViewById = dutiVar.a.findViewById(R.id.emoji_picker_header_underline);
        ImageView imageView = (ImageView) dutiVar.a.findViewById(R.id.emoji_picker_header_icon);
        for (Object obj : list) {
            if (obj instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.a.a(imageView, findViewById, booleanValue);
                dutiVar.C(booleanValue);
                return;
            }
        }
        g(dutiVar, i);
    }
}
