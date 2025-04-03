package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import j$.time.MonthDay;
import j$.time.format.DateTimeFormatter;
import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aisc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aisg b;
    final /* synthetic */ MonthDay c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisc(ffgu ffguVar, aisg aisgVar, MonthDay monthDay) {
        super(2, ffguVar);
        this.b = aisgVar;
        this.c = monthDay;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable f;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                f = (Closeable) this.d;
                ffci.b(obj);
            } else {
                ffci.b(obj);
                f = eleg.f("Cp2BirthdayQueries#getContactsWithBirthday");
                if (!((ctud) this.b.c.b()).i()) {
                    ((ensz) aisg.a.f()).q("No permission for syncing birthdays from contacts");
                    ffel ffelVar = ffel.a;
                    ffig.a(f, null);
                    return ffelVar;
                }
                ((ensz) aisg.a.f()).q("Syncing birthdays from contacts");
                String format = DateTimeFormatter.ofPattern("MM-dd").withZone(this.b.e.a).format(this.c);
                ekrc ekrcVar = new ekrc();
                ekrcVar.b("mimetype = ?");
                ekrcVar.c("vnd.android.cursor.item/contact_event");
                ekrcVar.b(" AND data2 = 3");
                ekrcVar.b(" AND data1 LIKE ?");
                ekrcVar.c(a.t(format, "%"));
                ekrb a = ekrcVar.a();
                aisg aisgVar = this.b;
                Uri uri = ContactsContract.Data.CONTENT_URI;
                uri.getClass();
                aisd aisdVar = aisd.a;
                this.d = f;
                this.a = 1;
                obj = aisgVar.a(uri, new String[]{"contact_id"}, a, aisdVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            List list = (List) obj;
            ffig.a(f, null);
            return list;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(r1, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aisc aiscVar = new aisc(ffguVar, this.b, this.c);
        aiscVar.d = obj;
        return aiscVar;
    }
}
