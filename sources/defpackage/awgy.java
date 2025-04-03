package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awgy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axaq b;
    final /* synthetic */ awhc c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awgy(axaq axaqVar, awhc awhcVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axaqVar;
        this.c = awhcVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awgy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                axan axanVar = (axan) eyfy.parseFrom(axan.a, this.b.e, eyfc.a());
                axanVar.getClass();
                String str = this.d;
                axam axamVar = (axam) axanVar.toBuilder();
                axamVar.getClass();
                axamVar.copyOnWrite();
                axan axanVar2 = (axan) axamVar.instance;
                axanVar2.b |= 1;
                axanVar2.c = str;
                axan a = axao.a(axamVar);
                axap axapVar = (axap) this.b.toBuilder();
                axapVar.getClass();
                axar.b(a.toByteString(), axapVar);
                elfl g = this.c.d.g(axar.a(axapVar));
                g.getClass();
                this.a = 1;
                obj = fgfz.c(g, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            axat axatVar = (axat) obj;
            awud awudVar = axatVar.c;
            if (awudVar == null) {
                awudVar = awud.a;
            }
            awuc b = awuc.b(awudVar.c);
            if (b == null) {
                b = awuc.UNKNOWN_STATUS;
            }
            if (b != awuc.PENDING) {
                awhc awhcVar = this.c;
                String str2 = this.d;
                awud awudVar2 = axatVar.c;
                if (awudVar2 == null) {
                    awudVar2 = awud.a;
                }
                awudVar2.getClass();
                awhcVar.a(str2, awudVar2);
            }
        } catch (Exception e) {
            ((enrr) ((enrr) awhc.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/groups/UpdateGroupChatHandler$callChatApi$1", "invokeSuspend", 103, "UpdateGroupChatHandler.kt")).q("Failed to call Chat API to update group chat");
            awhc awhcVar2 = this.c;
            String str3 = this.d;
            awty awtyVar = (awty) awud.a.createBuilder();
            awtyVar.getClass();
            awue.b(awuc.FAILED_PERMANENTLY, awtyVar);
            awhcVar2.a(str3, awue.a(awtyVar));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awgy(this.b, this.c, this.d, ffguVar);
    }
}
