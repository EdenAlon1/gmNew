package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zlj extends ffkh implements ffjm {
    public zlj(Object obj) {
        super(2, obj, zkt.class, "invalidate", "invalidate(ILcom/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiData;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        zqy zqyVar = (zqy) obj2;
        zqyVar.getClass();
        zkt zktVar = (zkt) this.g;
        zktVar.a.remove(zkt.a(zqyVar.a()));
        zktVar.b.remove(Integer.valueOf(intValue));
        return ffcu.a;
    }
}
