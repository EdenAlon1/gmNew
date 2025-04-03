package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anki extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new ankh(this);
    }

    public final void b(Iterable iterable) {
        int intValue = ankj.c().intValue();
        if (intValue < 10007) {
            dtub.w("conv_type", intValue);
        }
        aq(new dtrw("conversations.conv_type", 3, at(iterable), true));
    }

    public final void c(int i) {
        aq(new dtwe("conversations.participant_count", 9, Integer.valueOf(i)));
    }
}
