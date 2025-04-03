package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqjm {
    public static final efkj a;

    static {
        efkc efkcVar = new efkc();
        efkcVar.c("\n        CREATE TABLE `usages` (\n          `type` TEXT NOT NULL,\n          `value` TEXT NOT NULL,\n          `context` TEXT NOT NULL,\n          `time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n        )");
        efkcVar.c("\n          CREATE INDEX `type` ON `usages`(`type`)\n          ");
        efkcVar.c("\n        ALTER TABLE `usages` ADD COLUMN `search_term` TEXT DEFAULT NULL\n        ");
        efkcVar.c("\n          CREATE INDEX `usages_type` ON `usages`(`type`)\n          ");
        a = efkcVar.a();
    }

    public static final String a(String str) {
        String obj = ffpc.x(str).toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = obj.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }
}
