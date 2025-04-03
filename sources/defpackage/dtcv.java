package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtcv implements ffxy {
    final /* synthetic */ dtcy a;

    public dtcv(dtcy dtcyVar) {
        this.a = dtcyVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        int intValue = ((Number) obj).intValue();
        ((enrr) dtcy.b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver$attach$2$2", "emit", 70, "LayoutManagerSizeObserver.kt")).r("Dispatching new RecyclerView size (%d)", intValue);
        this.a.f.invoke(new Integer(intValue));
        return ffcu.a;
    }
}
