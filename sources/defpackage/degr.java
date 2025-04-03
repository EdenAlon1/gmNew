package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarCollections;
import java.security.InvalidParameterException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ degt b;
    final /* synthetic */ cvic c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public degr(ffgu ffguVar, degt degtVar, cvic cvicVar) {
        super(2, ffguVar);
        this.b = degtVar;
        this.c = cvicVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((degr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        cvik cvikVar;
        Object a;
        Object obj3;
        cvik cvikVar2;
        cvik cvikVar3;
        Object obj4;
        cvik cvikVar4;
        Object obj5;
        Object obj6;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj3 = this.h;
            obj4 = this.g;
            Object obj7 = this.f;
            Object obj8 = this.e;
            obj2 = this.d;
            cvikVar = (cvik) this.i;
            try {
                ffci.b(obj);
                cvikVar3 = cvikVar;
                cvikVar2 = obj2;
                a = obj;
                obj6 = obj7;
                obj5 = obj8;
            } catch (InvalidParameterException e) {
                e = e;
                ((cvik) obj2).b(9);
                ensz enszVar = (ensz) degt.a.j();
                enszVar.Y(csux.O, "LoadPagedMessagesHandler");
                ((ensz) enszVar.g(e)).q("#loadMessages ListMessagesRequest did not contain the expected parameters.");
                cvikVar4 = cvikVar;
                return cvikVar4.a();
            } catch (Exception e2) {
                e = e2;
                ((cvik) obj2).b(6);
                ensz enszVar2 = (ensz) degt.a.j();
                enszVar2.Y(csux.O, "LoadPagedMessagesHandler");
                ((ensz) enszVar2.g(e)).q("#loadMessages ListMessagesRequest parsing threw an unexpected error.");
                cvikVar4 = cvikVar;
                return cvikVar4.a();
            }
        } else {
            ffci.b(obj);
            cvik a2 = cvij.a((cvig) cvii.a.createBuilder());
            try {
                a2.b(3);
                cvie cvieVar = (cvie) cvif.a.createBuilder();
                cvieVar.getClass();
                cvid cvidVar = new cvid(cvieVar);
                List unmodifiableList = DesugarCollections.unmodifiableList(((cvif) cvidVar.a.instance).b);
                unmodifiableList.getClass();
                eyjx eyjxVar = new eyjx(unmodifiableList);
                degt degtVar = this.b;
                cvic cvicVar = this.c;
                this.i = a2;
                this.d = a2;
                this.e = cvidVar;
                this.f = a2;
                this.g = cvidVar;
                this.h = eyjxVar;
                this.a = 1;
                ConversationIdType b = bdgq.b(cvicVar.c);
                MessageIdType b2 = bdhb.b(cvicVar.e);
                int i = cvicVar.b;
                int i2 = i & 1;
                if (i2 != 0 && (i & 2) != 0) {
                    degw degwVar = (degw) degtVar.b.b();
                    int i3 = cvicVar.d;
                    eyja eyjaVar = cvicVar.f;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    a = ffra.a(ekxi.a(degwVar.g), new degv(null, b, i3, b2, degwVar, eykm.b(eyjaVar)), this);
                } else {
                    if (i2 != 0 || (i & 2) != 0) {
                        throw new InvalidParameterException("ListMessagesRequest must contain both MessageId and Timestamp, or neither of these values.");
                    }
                    degw degwVar2 = (degw) degtVar.b.b();
                    a = ffra.a(ekxi.a(degwVar2.g), new degu(null, b, cvicVar.d, degwVar2), this);
                }
                if (a == ffhhVar) {
                    return ffhhVar;
                }
                obj3 = eyjxVar;
                cvikVar2 = a2;
                cvikVar3 = cvikVar2;
                obj4 = cvidVar;
                obj6 = a2;
                obj5 = cvidVar;
            } catch (InvalidParameterException e3) {
                e = e3;
                obj2 = a2;
                cvikVar = obj2;
                ((cvik) obj2).b(9);
                ensz enszVar3 = (ensz) degt.a.j();
                enszVar3.Y(csux.O, "LoadPagedMessagesHandler");
                ((ensz) enszVar3.g(e)).q("#loadMessages ListMessagesRequest did not contain the expected parameters.");
                cvikVar4 = cvikVar;
                return cvikVar4.a();
            } catch (Exception e4) {
                e = e4;
                obj2 = a2;
                cvikVar = obj2;
                ((cvik) obj2).b(6);
                ensz enszVar22 = (ensz) degt.a.j();
                enszVar22.Y(csux.O, "LoadPagedMessagesHandler");
                ((ensz) enszVar22.g(e)).q("#loadMessages ListMessagesRequest parsing threw an unexpected error.");
                cvikVar4 = cvikVar;
                return cvikVar4.a();
            }
        }
        try {
            Iterable iterable = (Iterable) a;
            obj3.getClass();
            iterable.getClass();
            cvie cvieVar2 = ((cvid) obj4).a;
            cvieVar2.copyOnWrite();
            cvif cvifVar = (cvif) cvieVar2.instance;
            cvif cvifVar2 = cvif.a;
            eygr eygrVar = cvifVar.b;
            if (!eygrVar.c()) {
                cvifVar.b = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(iterable, cvifVar.b);
            eyfy build = ((cvid) obj5).a.build();
            build.getClass();
            cvig cvigVar = ((cvik) obj6).a;
            cvigVar.copyOnWrite();
            cvii cviiVar = (cvii) cvigVar.instance;
            cvii cviiVar2 = cvii.a;
            cviiVar.c = (cvif) build;
            cviiVar.b = 3;
            cvikVar4 = cvikVar3;
        } catch (InvalidParameterException e5) {
            e = e5;
            obj2 = cvikVar2;
            cvikVar = cvikVar3;
            ((cvik) obj2).b(9);
            ensz enszVar32 = (ensz) degt.a.j();
            enszVar32.Y(csux.O, "LoadPagedMessagesHandler");
            ((ensz) enszVar32.g(e)).q("#loadMessages ListMessagesRequest did not contain the expected parameters.");
            cvikVar4 = cvikVar;
            return cvikVar4.a();
        } catch (Exception e6) {
            e = e6;
            obj2 = cvikVar2;
            cvikVar = cvikVar3;
            ((cvik) obj2).b(6);
            ensz enszVar222 = (ensz) degt.a.j();
            enszVar222.Y(csux.O, "LoadPagedMessagesHandler");
            ((ensz) enszVar222.g(e)).q("#loadMessages ListMessagesRequest parsing threw an unexpected error.");
            cvikVar4 = cvikVar;
            return cvikVar4.a();
        }
        return cvikVar4.a();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        degr degrVar = new degr(ffguVar, this.b, this.c);
        degrVar.i = obj;
        return degrVar;
    }
}
