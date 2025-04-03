package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfq {
    public static final /* synthetic */ ffmx[] a;
    public final kho b;
    public final kfo e;
    public final kfn f;
    public final kfo g;
    public final kfn h;
    public final kfr c = new kfr("parent");
    private final kfp i = new kfp(this, new kgm("wrap"));
    public final kfp d = new kfp(this, new kgm("wrap"));

    static {
        ffko ffkoVar = new ffko(kfq.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(kfq.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), new ffko(kfq.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), new ffko(kfq.class, "scaleX", "getScaleX()F", 0), new ffko(kfq.class, "scaleY", "getScaleY()F", 0), new ffko(kfq.class, "rotationX", "getRotationX()F", 0), new ffko(kfq.class, "rotationY", "getRotationY()F", 0), new ffko(kfq.class, "rotationZ", "getRotationZ()F", 0), new ffko(kfq.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new ffko(kfq.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new ffko(kfq.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new ffko(kfq.class, "pivotX", "getPivotX()F", 0), new ffko(kfq.class, "pivotY", "getPivotY()F", 0), new ffko(kfq.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), new ffko(kfq.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};
    }

    public kfq(kho khoVar) {
        this.b = khoVar;
        this.e = new kgk(-2, khoVar);
        this.f = new kfs(0, khoVar);
        this.g = new kgk(-1, khoVar);
        this.h = new kfs(1, khoVar);
    }

    public final void a(kgm kgmVar) {
        this.i.d(a[0], kgmVar);
    }
}
