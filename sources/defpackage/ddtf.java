package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtf {
    public static final enhk a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public ddqu f;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(Integer.valueOf(R.id.images_chip), 2);
        enhdVar.k(Integer.valueOf(R.id.videos_chip), 3);
        enhdVar.k(Integer.valueOf(R.id.places_chip), 5);
        enhdVar.k(Integer.valueOf(R.id.links_chip), 4);
        a = enhdVar.c();
    }

    public ddtf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    public final void a() {
        ddqu ddquVar = this.f;
        ddquVar.getClass();
        if (ddquVar.v()) {
            ((ResultsFilterView) this.b.b()).setVisibility(0);
        } else {
            ((ResultsFilterView) this.b.b()).setVisibility(8);
        }
    }
}
