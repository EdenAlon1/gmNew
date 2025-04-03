package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.widget.GridLayoutManager;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czeh extends vk implements czew {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/emoji/EmojiRecyclerViewAdapter");
    public static final Integer[] d = {Integer.valueOf(R.array.emoji_emotions), Integer.valueOf(R.array.emoji_people), Integer.valueOf(R.array.emoji_nature), Integer.valueOf(R.array.emoji_food), Integer.valueOf(R.array.emoji_places), Integer.valueOf(R.array.emoji_activities), Integer.valueOf(R.array.emoji_objects), Integer.valueOf(R.array.emoji_symbols), Integer.valueOf(R.array.emoji_flags)};
    public static final Integer[] e = {Integer.valueOf(R.string.am_emoji_category_recent), Integer.valueOf(R.string.am_emoji_category_smileys_and_emotions), Integer.valueOf(R.string.am_emoji_category_people), Integer.valueOf(R.string.am_emoji_category_animals_and_nature), Integer.valueOf(R.string.am_emoji_category_food_and_beverage), Integer.valueOf(R.string.am_emoji_category_travel_and_places), Integer.valueOf(R.string.am_emoji_category_activities_and_events), Integer.valueOf(R.string.am_emoji_category_objects), Integer.valueOf(R.string.am_emoji_category_symbols), Integer.valueOf(R.string.am_emoji_category_flags)};
    public final Context f;
    public final altk g;
    public final czdp h;
    public final czes i;
    public final cstx j;
    public final int k;
    public final czex l;
    public final czel m;
    public FrameLayout.LayoutParams n;
    public List o = new ArrayList();
    public List p = new ArrayList();
    public SparseIntArray q = new SparseIntArray();
    public SparseArray r = new SparseArray();
    public int s;
    public int t;
    public int u;
    public czea v;
    public czfz w;
    private final LayoutInflater x;

    public czeh(Context context, czex czexVar, cstx cstxVar, altk altkVar, czes czesVar, czdp czdpVar, czel czelVar) {
        this.f = context;
        this.l = czexVar;
        this.j = cstxVar;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.emoji_gallery_icon_size_updated);
        this.g = altkVar;
        this.i = czesVar;
        this.h = czdpVar;
        this.m = czelVar;
        this.x = LayoutInflater.from(context);
    }

    public final int F() {
        return this.p.isEmpty() ? 1 : 0;
    }

    public final int G() {
        int i = this.u;
        return i + i;
    }

    public final void H(int i) {
        Resources resources = this.f.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.emoji_gallery_padding);
        int i2 = i - (dimensionPixelSize + dimensionPixelSize);
        int max = Math.max(1, i2 / resources.getDimensionPixelSize(R.dimen.emoji_gallery_column_size_updated));
        this.u = max;
        int max2 = Math.max(1, i2 / max);
        this.t = max2;
        this.s = Math.max(0, (max2 - this.k) / 2);
        int i3 = this.t;
        this.n = new FrameLayout.LayoutParams(i3, i3);
    }

    public final void I(List list, SparseIntArray sparseIntArray) {
        czdz czdzVar;
        GridLayoutManager gridLayoutManager;
        if (this.l.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.p = new ArrayList();
        int G = G();
        Iterator it = this.l.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (i >= G) {
                break;
            }
            if (this.h.b(str)) {
                arrayList.add(new czeb(str, 0, false));
                this.p.add(str);
                i++;
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            int i2 = size + 1;
            int m = m(1);
            if (sparseIntArray.indexOfKey(0) < 0) {
                list.add(0, new czeb(this.f.getResources().getString(R.string.am_emoji_category_recent), 0, true));
                sparseIntArray.put(0, 0);
            } else {
                list.subList(1, m).clear();
            }
            int i3 = i2 - m;
            if (i3 != 0) {
                for (int i4 = 0; i4 < this.q.size(); i4++) {
                    int keyAt = this.q.keyAt(i4);
                    if (keyAt != 0) {
                        this.q.put(keyAt, this.q.get(keyAt) + i3);
                    }
                }
                czea czeaVar = this.v;
                if (czeaVar != null && (gridLayoutManager = (czdzVar = (czdz) czeaVar).al) != null) {
                    int L = gridLayoutManager.L();
                    if (L == 0) {
                        if (czdzVar.b.a.size() <= 1) {
                            L = 0;
                        }
                    }
                    View U = czdzVar.al.U(L);
                    czdzVar.al.ac(L + i3, U != null ? U.getTop() : 0);
                }
            }
            for (int i5 = 1; i5 < i2; i5++) {
                list.add(i5, (czeb) arrayList.get(i5 - 1));
            }
        }
    }

    @Override // defpackage.czew
    public final void J(czex czexVar) {
        I(this.o, this.q);
    }

    public final void K() {
        this.w = null;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.o.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return ((czeb) this.o.get(i)).c - 1;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return i == 0 ? new czeg(this, this.x.inflate(R.layout.emoji_recycler_view_header, viewGroup, false)) : new czef(this, this.x.inflate(R.layout.emoji_recycler_view_item, viewGroup, false));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        czeb czebVar = (czeb) this.o.get(i);
        if (czebVar.c == 1) {
            czeg czegVar = (czeg) wrVar;
            String str = czebVar.a;
            czegVar.s.setText(str);
            czegVar.s.setContentDescription(str);
            czegVar.a.setContentDescription(str);
            return;
        }
        czef czefVar = (czef) wrVar;
        String str2 = czebVar.a;
        czefVar.s.g();
        czefVar.s.setLayoutParams(czefVar.u.n);
        AsyncImageView asyncImageView = czefVar.s;
        int i2 = czefVar.u.s;
        asyncImageView.setPadding(i2, i2, i2, i2);
        czefVar.s.setOnClickListener(czefVar);
        czefVar.s.setOnLongClickListener(czefVar);
        String a2 = czefVar.u.h.a(czefVar.u.i.b(str2));
        Uri f = csuu.f(czefVar.u.f, a2);
        int i3 = czefVar.u.k;
        czefVar.s.d(new cbba(f, i3, i3));
        czefVar.s.setContentDescription(a2);
        czefVar.a.setContentDescription(a2);
        czefVar.t.setVisibility(true != czefVar.E(str2) ? 8 : 0);
    }

    public final int m(int i) {
        if (this.q.indexOfKey(i) < 0) {
            return 0;
        }
        return this.q.get(i);
    }
}
