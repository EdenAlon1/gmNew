package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes9.dex */
final class J1 extends AbstractC0175y0 {
    public final /* synthetic */ int h;

    public /* synthetic */ J1(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.AbstractC0175y0
    public final X1 R() {
        switch (this.h) {
            case 0:
                return new C0063b2();
            case 1:
                return new Z1();
            case 2:
                return new C0068c2();
            default:
                return new C0058a2();
        }
    }

    @Override // j$.util.stream.AbstractC0175y0, j$.util.stream.X3
    public final Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.a(abstractC0060b, spliterator);
    }

    @Override // j$.util.stream.AbstractC0175y0, j$.util.stream.X3
    public final Object b(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC0124n3.SIZED.y(abstractC0060b.F())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(abstractC0060b, spliterator);
    }

    @Override // j$.util.stream.AbstractC0175y0, j$.util.stream.X3
    public final int c() {
        switch (this.h) {
        }
        return EnumC0124n3.r;
    }
}
